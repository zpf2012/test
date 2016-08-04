package com.util;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConn {
	public static void main(String[] args) throws SQLException{
		ConnectionFactory cf = ConnectionFactory.getInstance();
		Connection conn = cf.makeConn();
		System.out.println(conn.getAutoCommit());
		
	}
}
