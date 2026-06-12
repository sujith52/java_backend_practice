package com.sujith;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApp02 {
	public static void main(String[] args)  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String user = "root";
		String password = "sujith";
		Connection connect = DriverManager.getConnection(url, user, password);
		
		Statement statement = connect.createStatement();
		
		String sql = "SELECT * FROM studentinfo";
//		String sql = "UPDATE studentinfo set sage = 22 where id =1";
		
		boolean status = statement.execute(sql);
		
		if(status) {
			ResultSet rs = statement.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
		}else {
			int rows = statement.getUpdateCount();
			if(rows == 0) {
				System.out.println("The operation has failed bro !");
			} else {
				System.out.println("The operation was sucessfull !");
			}
		}
		
		connect.close();
		statement.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
