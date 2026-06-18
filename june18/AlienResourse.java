package com.sujith.demorest;

import jakarta.ws.rs.core.MediaType;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("aliens")
public class AlienResourse {
	
	AlienRepo repos = new AlienRepo();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Aelins> getAliens() {
		System.out.println("The class is called bro !");
		return repos.getAliens();
	}
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Aelins getAlien(@PathParam("id") int id) 
	{
		return repos.getAlien(id);
	}
	
	@POST
	@Path("alien")
	public Aelins createAlien(Aelins a1) {
		System.out.println("The alien path was working well and good !");
		System.out.println(a1);
		repos.create(a1);
		return a1;
	}
	
}
