package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.AddressDao;
import com.entities.Address;

public class AddressDaoImpl implements AddressDao{
	public void insert(Connection conn, Address address) throws SQLException {
		String insert = "insert into tbl_address(city, country, user_id) values(?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(insert);
		
		ps.setString(1, address.getCity());
		ps.setString(2, address.getCountry());
		ps.setLong(3, address.getUserId());
		ps.execute();
	}

	public void update(Connection conn, Address address) throws SQLException {
		String update = "update tbl_address set city = ?, country = ?, user_id = ? where id = ?";
		PreparedStatement ps = conn.prepareStatement(update);
		
		ps.setString(1, address.getCity());
		ps.setString(2, address.getCountry());
		ps.setLong(3, address.getUserId());
		ps.setLong(4, address.getId());
		ps.execute();
	}

	public void delete(Connection conn, Address address) throws SQLException {
		String delete = "delete from tbl_address where id = ?";
		PreparedStatement ps = conn.prepareStatement(delete);
		ps.setLong(1, address.getId());
		ps.execute();
	}
	
}
