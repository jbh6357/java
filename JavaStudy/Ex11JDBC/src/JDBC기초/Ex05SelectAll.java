package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex05SelectAll {

	public static void main(String[] args) {
		// select * from datadesignmember
		// ===== 전체 회원 조회 =====
		// ID 이름 나이 점수 -> \t
		// smhrd 이도연 20 0
		// smhrd 이도연2 21 50
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
					
			String sql = "select * from datadesignmember";
			
//			rs = conn.prepareStatement(sql).executeQuery();
			rs = conn.createStatement().executeQuery(sql);
			System.out.println("========= 전체 회원 조회 =========");
			
			System.out.println("ID\tNAME\tAGE\tSCORE");
			
			while(rs.next())
			{	
//				System.out.println(rs.getString("ID") +  "\t" +
//									rs.getString("NAME") + "\t" +
//									rs.getInt("age")  + "\t" +
//									rs.getInt("SCORE"));
				System.out.printf("%s\t%s\t%d\t%d\n", rs.getString("ID"),
						rs.getString("NAME"), rs.getInt("age")
						, rs.getInt("SCORE"));
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {	
				if (rs!= null)
					rs.close();
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
