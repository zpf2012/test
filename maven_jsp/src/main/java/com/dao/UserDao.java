package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.entities.User;


public interface UserDao {
	public void save(Connection conn, User user) throws SQLException;

	public void update(Connection conn, User user) throws SQLException;

	public void delete(Connection conn, User user) throws SQLException;
	
	public ResultSet resultSet(Connection conn, User user) throws SQLException;
}
