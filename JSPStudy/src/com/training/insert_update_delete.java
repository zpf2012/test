package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert_update_delete {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void insert() {
		Connection conn = getConnection();
		String sql = "insert into tbl_user values (4,'xiaohong','asd123','xiaohong@qq.com')";

		try {
			Statement statement = conn.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("插入操作执行完毕"+count);

			statement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update() {
		Connection conn = getConnection();
		String sql = "update tbl_uset set id = 5 where name = 'xiaowang'";
		Statement st;
		try {
			st = conn.createStatement();
			int rs = st.executeUpdate(sql);

			System.out.println("更新操作执行完毕" + rs);
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void delete() {
		Connection conn = getConnection();
		String sql = "delete from tbl_user where id = 4";
		Statement st;
		try {
			st = conn.createStatement();
			int rs = st.executeUpdate(sql);

			System.out.println("删除操作执行完成" + rs);
			st.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// 三个方法操作对象相同，逐一使用可以看出效果
		// 注意在执行select的时候使用的是statement.executeQuery(sql)，在执行增删改操作的时候使用的是statement.executeUpdate(sql)
		insert_update_delete isd = new insert_update_delete();
		// isd.insert();
		// isd.update();
		isd.delete();
	}
}
