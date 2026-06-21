package com.sujith;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	
	@Id
	private String aname;
	private int aid;
	private String acourse;
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAcourse() {
		return acourse;
	}
	public void setAcourse(String acourse) {
		this.acourse = acourse;
	}
	@Override
	public String toString() {
		return "Alien [aname=" + aname + ", aid=" + aid + ", acourse=" + acourse + "]";
	}
	
	
	
}
