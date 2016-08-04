package com.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entities.User;
import com.util.ConnectionFactory;

public class UserDaoTestUpdate {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConn();
			conn.setAutoCommit(false);
			
			UserDao ud = new UserDaoImpl();
			User tom = new User();
			tom.setName("Tom");
			tom.setPassword("tom123");
			tom.setEmail("tom@hand-china.com");
			tom.setId(4);
			
			ud.update(conn, tom);
			
			conn.commit();
			System.out.println("提交事务完成");
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("事务回滚");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
