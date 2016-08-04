package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transcation {

	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void insetUser(Connection conn) throws SQLException{
		String sql = "insert into tbl_user values (5,'xiaohua','234asd','xiaohua@hand.com')";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		
		System.out.println("向用户表插入了"+count+"条记录");
	
	}
	
	public void insetAddress(Connection conn) throws SQLException{
		String sql = "insert into tbl_user values (1,'Shenzhen','China',5)";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		
		System.out.println("向地址表插入了"+count+"条记录");		
	}
	
	public static void main(String[] args) {
		Transcation ts = new Transcation();
		Connection conn = getConnection();
		try {
			conn.setAutoCommit(false);
			ts.insetUser(conn);
			ts.insetAddress(conn);
			
			conn.commit();
		} catch (SQLException e) {
			System.out.println("=========捕获到异常信息=========");
			e.printStackTrace();
			try {
				conn.rollback();
				System.out.println("=========回滚成功=========");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}finally {
			try {
				if( conn != null){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
