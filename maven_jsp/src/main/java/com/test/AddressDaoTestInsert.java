package com.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.AddressDao;
import com.dao.impl.AddressDaoImpl;
import com.entities.Address;
import com.util.ConnectionFactory;

public class AddressDaoTestInsert {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConn();
			conn.setAutoCommit(false);
			
			AddressDao ado = new AddressDaoImpl();
			Address address = new Address();
			address.setCity("chongqing");
			address.setCountry("China");
			address.setUserId(4);
			
			ado.insert(conn, address);
			conn.commit();
			System.out.println("添加成功");
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("创建失败，执行回滚");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
