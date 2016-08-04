package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entities.Address;

public interface AddressDao {
	public void insert(Connection conn, Address address) throws SQLException;
	
	public void update(Connection conn, Address address) throws SQLException;
	
	public void delete(Connection conn, Address address) throws SQLException;

}
