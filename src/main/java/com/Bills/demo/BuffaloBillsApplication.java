package com.Bills.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class BuffaloBillsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BuffaloBillsApplication.class, args);
		// Get the BillsServiceLayer bean from the application context
		BillsServiceLayer billsService = context.getBean(BillsServiceLayer.class);				//.run(BuffaloBillsApplication.class, args)
				//.getBean(BillsServiceLayer.class);
//g
		// Add Josh Allen to the database
		//billsService.addJoshAllenToDatabase();
		//billsService.addTyrodTaylorToDatabase();

		billsService.findQBByYear();
		billsService.compareQBs();


		//Create Configuration  (No need since we are using application.properties
		//Configuration configuration=new Configuration();
		//configuration.configure("hibernate.cfg.xml");

		//Instead of manually creating a SessionFactory, you can inject the EntityManagerFactory or EntityManager directly into your repository or service beans
		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		//Session session=sessionFactory.openSession();


		//test to add additional users
		//BillsServiceLayer qb1= new BillsServiceLayer();
		//qbd.addJoshAllenToDatabase();

	}

}




//Want to upload Buffalo Bills Quarterbacks and the years they started.
// Will then type a year and see who was the starter that season

//Dependencies: JDBC, Hibernate, Spring Web, mySQL

//create QB and Years Active Service layer class.
//Entity, Table, Id, columns, getters, setters

//Set up mySQL server
//Set up mySQL workbench that connects to mySQL server
//Create Database/Schema and add qb's and their dates

//Create Repository
//Create Service Layer

//Configuration provided in application.properties