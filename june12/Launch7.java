package com.sujith;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Launch7 {
	public static void main(String [] args) {
		Connection connect = null;
		PreparedStatement pstmnt = null;
		ResultSet rs = null;
		try 
		{
			
			connect = JDBCConnection.getConnection();
			
//			String query= "UPDATE studentinfo SET  sage=? WHERE id=?";
//			pstmnt = connect.prepareStatement(query);
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the user id : ");
//			Integer id = sc.nextInt();
//			pstmnt.setInt(2, id);
//			
//			System.out.println("Enter the updated user age : ");
//			Integer age = sc.nextInt();
//			pstmnt.setInt(1, age);
//			
//			int rowseffected = pstmnt.executeUpdate();
//			if(rowseffected == 0) {
//				System.out.println("The operation failed !");
//			} else {
//				System.out.println("The insertion was sucessfull bros ");
//			}
			
			// prepared statement retriving the data 
			
//			String query= "SELECT id,sname,sage,scity from studentinfo WHERE id=?";
//			pstmnt = connect.prepareStatement(query);
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the user id : ");
//			Integer id = sc.nextInt();
//			pstmnt.setInt(1, id);
//			
//			rs = pstmnt.executeQuery();
//			if(rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " "+ rs.getInt(3) + " "+ rs.getString(4));
//				
//			} else {
//				System.out.println("There was no record on such an id ! bro " + id);
//			}
			
			
			// batch update things 
			
			String query= "UPDATE studentinfo SET  sage=? WHERE id=?";
			pstmnt = connect.prepareStatement(query);
			
			
			pstmnt.setInt(1, 22);
			pstmnt.setInt(2, 1);
			pstmnt.addBatch();
			
			pstmnt.setInt(1, 22);
			pstmnt.setInt(2, 2);
			pstmnt.addBatch();
			
			pstmnt.executeBatch();
			System.out.println("Thw hole batch was updated ");
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
