package com.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entities.User;
import com.util.ConnectionFactory;
/**
 * 删除测试
 * @author zhangpengfei
 *
 */
public class UserDaoTestDelete {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConn();
			conn.setAutoCommit(false);
			
			UserDao ud = new UserDaoImpl();
			User tom = new User();
			tom.setId(6);
			
			ud.delete(conn, tom);
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
