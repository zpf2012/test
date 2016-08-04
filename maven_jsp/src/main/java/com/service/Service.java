package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entities.User;
import com.util.ConnectionFactory;

public class Service {
//	创建用户操作实例
	private UserDao userDao = new UserDaoImpl();
	public boolean check(User user){
		System.out.println("----创建数据库连接-----");
		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConn();
			System.out.println("----创建数据库连接成功-----");
			conn.setAutoCommit(false);
//			取得查询结果
			ResultSet rs = userDao.resultSet(conn, user);
			
//			System.out.println(rs.next());
			while(rs.next()){
				return true;
			}	
			
			conn.commit();			
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return false;
	}
}
