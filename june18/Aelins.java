package com.sujith.demorest;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aelins {
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private int points;
	public Aelins() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public String toString() {
		return "Aelins [name=" + name + ", points=" + points + "]";
	}

}
