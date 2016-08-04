package com.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.AddressDao;
import com.dao.impl.AddressDaoImpl;
import com.entities.Address;
import com.util.ConnectionFactory;

public class AddressDaoTestDelete {

	public static void main(String[] args) {
		Connection conn = null;
		conn = ConnectionFactory.getInstance().makeConn();
		try {
			conn.setAutoCommit(false);
			
			AddressDao ado = new AddressDaoImpl();
			Address address = new Address();
			address.setId(4);
			
			ado.delete(conn, address);
			conn.commit();
			System.out.println("删除成功");
			
			
			
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("删除失败，执行回滚");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
