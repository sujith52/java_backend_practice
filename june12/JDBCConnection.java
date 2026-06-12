package com.sujith;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCConnection {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String user = "root";
		String password = "sujith";
		return DriverManager.getConnection(url,user,password);
	}
	
	public static void closeConnection(Connection connect , Statement statement) throws SQLException {
		statement.close();
		connect.close();
	}
}
