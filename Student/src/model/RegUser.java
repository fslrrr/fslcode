package model;
import java.sql.*;

import beans.StudentInfo;

public class RegUser {
	private Connection conn = null;

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

	public boolean reguser(StudentInfo user) {

		
		
		String sql = "insert into dbuser(username,password,names,id,classs) values (?,?,?,?,?)";
		
		conn = getConn();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.username);
			pstmt.setString(2, user.password);
			pstmt.setString(3, user.names);
			pstmt.setInt(4, user.id);
			pstmt.setString(5, user.classes);
			int rs = pstmt.executeUpdate();
			
			if(rs>0){
				return true;
			}



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
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


