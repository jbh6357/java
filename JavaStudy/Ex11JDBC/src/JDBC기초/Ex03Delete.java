package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {
		// 1. 사용자에게 id, pw 입력받기
		// 회원탈퇴 성공 ---> 출력 => 일치하는 행을 찾아서 삭제!
		// 회원탈퇴 실패 ---> 출력 =>
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		Connection conn = null;
		PreparedStatement psmt = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
					
			String sql = "delete from datadesignmember where id = ? and pw = ?";
			
			psmt = conn.prepareStatement(sql);
		
			psmt.setString(1,id);
			psmt.setString(2,pw);
		
			int row = psmt.executeUpdate();
			
			if(row >0 ) {
				System.out.println("회원탈퇴 성공!");
			}else {
				System.out.println("회원탈퇴 실패 ㅠㅠ");
				System.out.println("아이디나 비밀번호를 다시 확인해보세요.");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {	
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
