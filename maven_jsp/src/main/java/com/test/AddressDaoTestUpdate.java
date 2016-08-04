package com.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.AddressDao;
import com.dao.impl.AddressDaoImpl;
import com.entities.Address;
import com.util.ConnectionFactory;

public class AddressDaoTestUpdate {

	public static void main(String[] args) {
		Connection conn = null;
		conn = ConnectionFactory.getInstance().makeConn();
		try {
			conn.setAutoCommit(false);
			
			AddressDao ado = new AddressDaoImpl();
			Address address = new Address();
			address.setCity("Guiyang");
			address.setCountry("China");
			address.setUserId(5);
			address.setId(5);
			
			ado.update(conn, address);
			
			conn.commit();
			System.out.println("更新成功");
			
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
