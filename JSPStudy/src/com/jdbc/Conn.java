package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * JDBC连接数据库（MySQL和Oracle）
 * @author zhangpengfei
 * 两者连接的驱动和conn都是不同的
 */
public class Conn {

	public static void main(String[] args) {
//		String sql = "select employee_id,last_name from employees";
		String sql = "select * from tbl_user where id = 1";
		Connection conn;
		Statement statement;
		ResultSet result;
		
		try {
//			配置连接驱动和连接串 ，连接Oracle数据库
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			
//			连接Mysql数据库
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
			statement = conn.createStatement();
			result = statement.executeQuery(sql);

			while (result.next()) {
				System.out.print(result.getInt("id")+ "  ");
				System.out.print(result.getString("name")+ "  ");
				System.out.print(result.getString("password")+ "  ");
				System.out.println(result.getString("email")+"  ");
			}
			
			result.close();
			statement.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
