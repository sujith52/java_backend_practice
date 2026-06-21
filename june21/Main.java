package com.sujith;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String [] args) {
		System.out.println("The hibernate project in the marven was running !");
		
		Alien a1 = new Alien();
		a1.setAid(102);
		a1.setAname("sreeja");
		a1.setAcourse("Python fullstack ");
		
		Alien a2 = new Alien();
		a2.setAid(101);
		a2.setAname("latha");
		a2.setAcourse( "web fullstack");
		
		System.out.println(a2.toString());
		
		Configuration config = new Configuration();
		config.addAnnotatedClass(com.sujith.Alien.class);
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.persist(a1);
		session.persist(a2);
		transaction.commit();
	}
}
