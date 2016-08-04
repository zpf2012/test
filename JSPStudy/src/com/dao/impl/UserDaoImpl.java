package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.UserDao;
import com.entities.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(Connection conn, User user) throws SQLException {
		String insertsql = "insert into tbl_user(name, password, email) values (?,?,?)";
		PreparedStatement ps = conn.prepareStatement(insertsql);
		
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.execute();
	}

	@Override
	public void update(Connection conn, User user) throws SQLException {
		String update = "update tbl_user set name = ?, password = ?, email = ? where id = ? ";
		PreparedStatement ps = conn.prepareStatement(update);
		
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setLong(4, user.getId());
		ps.execute();
	}

	@Override
	public void delete(Connection conn, User user) throws SQLException {
		String delete = "delete from tbl_user where id = ?";
		PreparedStatement ps = conn.prepareStatement(delete);
		ps.setLong(1, user.getId());
		ps.execute();
	}

	@Override
	public ResultSet resultSet(Connection conn, User user) throws SQLException {
		String select = "select * from tbl_user where name = ? and password = ?";
		PreparedStatement ps = conn.prepareStatement(select);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ResultSet rs = ps.executeQuery();
		System.out.println("query");
		return rs;
	}

}
