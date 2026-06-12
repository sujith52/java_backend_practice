package com.sujith;
import java.sql.*;
public class JDBCApp01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// creating the db connection bros 
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String user = "root";
		String password = "sujith";
		Connection connect = DriverManager.getConnection(url, user, password);
		
		//creating the statement
		Statement statement = connect.createStatement();
		
		//our code goes here 
		
//		String sql= "INSERT INTO studentinfo(id,sname,sage,scity) VALUES(3,'Latha',21,'madanapalle')";
//		int affectedrows = statement.executeUpdate(sql);
		
		String sql = "SELECT * FROM studentinfo";
		ResultSet rs =  statement.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getInt(3)+" "+rs.getString(4));
		}
		rs.close();
		
//		System.out.println(rs);
//		if(affectedrows == 0) {
//			System.out.println("The operation has failed");
//		}else {
//			System.out.println("The data has done sucessfully ");
//		}
		//closing ythe connection everytime weuse
		
		statement.close();
		connect.close();
	}
}
