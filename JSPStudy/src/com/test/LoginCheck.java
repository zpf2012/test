package com.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entities.User;
import com.util.ConnectionFactory;

public class LoginCheck {
	public static void main(String[] args) {
		Connection conn = ConnectionFactory.getInstance().makeConn();
		
		String username;
		String password;
		UserDao ud = new UserDaoImpl();
		User user = new User();
		user.setName("");
		try {
			ud.resultSet(conn, user);
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
