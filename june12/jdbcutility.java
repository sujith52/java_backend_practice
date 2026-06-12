package com.sujith;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcutility {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbclearning";
			String user = "root";
			String password = "sujith";
			Connection connect = DriverManager.getConnection(url,user,password);
			
//			String sql = "SELECT * FROM studentinfo";
			String query = "INSERT INTO studentinfo(id,sname,sage,scity) VALUES (?,?,?,?)";
//			Statement statement = connect.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Give the id of user :");
			Integer id = sc.nextInt();
			
			System.out.println("Give the name  of user :");
			String name = sc.next();
			
			System.out.println("Give the age of user :");
			Integer age = sc.nextInt();
			
			System.out.println("Give the palce city  of user :");
			String city = sc.next();
			
			PreparedStatement pscmt = connect.prepareStatement(query);
			pscmt.setInt(1, id);
			pscmt.setString(2, name);
			pscmt.setInt(3, age);
			pscmt.setString(4, city);
			
			
			int rowseffected = pscmt.executeUpdate();
			if(rowseffected == 0) {
				System.out.println("It is the not done");
			} else {
				System.out.println("it is doen bro ");
			}
//			
			connect.close();
			pscmt.close();
			
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
