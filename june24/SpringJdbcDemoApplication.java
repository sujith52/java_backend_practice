package com.sujith.SpringJDBCDemo;

import com.sujith.SpringJDBCDemo.Model.Alien;
import com.sujith.SpringJDBCDemo.Repositry.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Alien ali = context.getBean(Alien.class);
		ali.setId(101);
		ali.setName("Sujith");
		ali.setCourse("Java Full Stack");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(ali);
		System.out.println(repo.findAll());
	}

}
