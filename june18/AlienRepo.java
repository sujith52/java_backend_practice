package com.sujith.demorest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.sql.*;

public class AlienRepo {
	
	Connection conn = null;
	public AlienRepo() {
		
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String user = "root";
		String passwod = "sujith";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, passwod);
			
			System.out.println("the databsese connected sucessfully");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public List<Aelins> getAliens(){
		
		List<Aelins> aliens = new ArrayList<>();
		String sql = "SELECT * FROM restdb";
		try {
			Statement stmnt = conn.createStatement();
			ResultSet rs = stmnt.executeQuery(sql);
			while(rs.next()) {
				Aelins a = new Aelins();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				
				aliens.add(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return aliens;
	}
	
	public Aelins getAlien(int id) {
		String sql = "SELECT * FROM restdb where id ="+id;
		Aelins a = new Aelins();
		try {
			Statement stmnt = conn.createStatement();
			ResultSet rs = stmnt.executeQuery(sql);
			while(rs.next()) {
				
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
		
	}
	
	public void create(Aelins a1) {
		String sql = "INSERT INTO restdb VALUES(?,?,?)";
		
		try {
			PreparedStatement stmnt = conn.prepareStatement(sql);
			
			stmnt.setInt(1, a1.getId());
			stmnt.setString(2, a1.getName());
			stmnt.setInt(3, a1.getPoints());
			
			stmnt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}







