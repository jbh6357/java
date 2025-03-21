package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex06Dama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		//DB드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//DB연결에 필요한 설정값
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		
		while(true) {
			System.out.println("메뉴 [1]다마고치 생성 [2]다마고치 키우기 [3]종료");
			int select = sc.nextInt();
			if(select==1) { //생성
				// 다마고치 생성
				// 사용자에게 이름, 좋아하는 음식 입력받기
				// 다마고치의 배고픔, 졸림은 무조건 각 30으로
				System.out.print("이름 >> ");
				String name = sc.next();
				System.out.print("음식 >> ");
				String food = sc.next();
								
				// 1. DB 작업
				try {
					// 작업할때마다 새로운 커넥션을 생성
					conn = DriverManager.getConnection(url, user, password);
					
					// 다마고치 생성 정보
					String sql = "INSERT INTO DAMA VALUES(?,?,30,30)";
					psmt = conn.prepareStatement(sql);
					
					psmt.setString(1,name);
					psmt.setString(2,food);
					
					
					int row = psmt.executeUpdate();
					
					if(row>0) {
						System.out.println("다마고치 생성 성공!");
					}else {
						System.out.println("다마고치 생성 실패ㅠ");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(psmt!=null)
						psmt.close();
						if(conn!=null)
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
			}else if(select==2) { //키우기
				System.out.println("메뉴 [1]상태확인 [2]밥주기 [3]재우기");
				int select2 = sc.nextInt();
				String sql;
				switch(select2)
				{
				 case 1 : 
					 // 내가 만든 모든 다마고치의 상태를 볼 수 있게
					 	sql = "SELECT * FROM DAMA";
					try {
						conn = DriverManager.getConnection(url, user, password);
						rs = conn.createStatement().executeQuery(sql);
						
						
						System.out.println("======= 다마고치 상태확인 =======");
						
						System.out.println("이름\t음식\t배고픔\t졸림");
						while(rs.next()) {
							
							System.out.println(rs.getString("NAME")+ "\t"
									           +rs.getString("FOOD") + "\t"
									           +rs.getInt("HUNGRY") + "\t"
									           +rs.getInt("SLEEPY"));
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}finally {
							try {
								if(rs!=null)
								rs.close();
								if(psmt!=null)
								psmt.close();
								if(conn!=null)
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
					}
					break;
				 case 2 : //밥주기 선택
					// 1. 다마고치의 이름과, 어떤 음식을 줄지를 입력받기 
					// 2. 1에서 입력한 이름이 있는지 검사
					// 3. 밥주기 완료!
					// 4. 배고픔을 -5 시키기
					System.out.print("이름 >> ");
					String name = sc.next();
					System.out.print("음식 >> ");
					String food = sc.next(); 
					
					sql = "select * FROM DAMA where name = ?";
					
					
					try {
						conn = DriverManager.getConnection(url, user, password);
						
						
						psmt = conn.prepareStatement(sql);
						
						psmt.setString(1,name);

						
						rs = psmt.executeQuery();
						
						if(rs.next()) {		
							int hungry = rs.getInt("HUNGRY");
							if(rs.getString("FOOD").equals(food))
							{
								hungry -= 10;
								System.out.println(rs.getString("NAME") + "가(이) 좋아하는 음식이에요!!");
							}else {
								hungry -= 5;
							}
							
							sql = "update dama set hungry = ? where name = ?";
							psmt = conn.prepareStatement(sql);
							
							psmt.setInt(1, hungry);
							psmt.setString(2, name);
							
							int result = psmt.executeUpdate();
							
							if(result>0) {
								System.out.println("밥주기 완료!");
								System.out.println("현재 배고픔은 " + hungry + "입니다");
							}else {
								System.out.println("밥주기 실패!");
							}
					
							
						}else {
							System.out.println("밥주기 실패!");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}finally {
							try {
								if(rs!=null)
								rs.close();
								if(psmt!=null)
								psmt.close();
								if(conn!=null)
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
					} 
					break;
				 case 3 :	 				
				}
			}else if(select==3)
			{
				break;
			}
		}
		
	}

}
