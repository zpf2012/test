package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entities.User;
import com.util.ConnectionFactory;

public class Service {
	private UserDao userDao = new UserDaoImpl();
	public boolean check(User user){
		Connection conn = ConnectionFactory.getInstance().makeConn();
		try {
			
			ResultSet rs = userDao.resultSet(conn, user);
			System.out.println(rs.next());
			while(rs.next()){
				System.out.println("验证成功");
				return true;
			}			
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
