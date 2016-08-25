package model;

import java.sql.*;
import beans.StudentInfo;



public class CheckUser {

	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	
	
	public Connection getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "test", "test");

		} catch (ClassNotFoundException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  } catch (SQLException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }

		return conn;
	}

	public boolean checkUser(StudentInfo user) {
		
		

		String sql = "select * from dbuser where username =? and password = ?";
		conn = getConn();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.username);
			pstmt.setString(2, user.password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					rs = null;
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					pstmt = null;
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-genserated catch block
					e.printStackTrace();
				} finally {
					conn = null;
				}
		}

		return false;
	}

}
