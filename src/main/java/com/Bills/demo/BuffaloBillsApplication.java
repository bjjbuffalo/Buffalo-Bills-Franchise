package com.Bills.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;


@SpringBootApplication
public class BuffaloBillsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BuffaloBillsApplication.class, args);
		// Get the BillsServiceLayer bean from the application context
		BillsServiceLayer billsService = context.getBean(BillsServiceLayer.class);				//.run(BuffaloBillsApplication.class, args)
		RBServiceLayer rbServiceLayer = context.getBean(RBServiceLayer.class);
//g
		// Add Josh Allen to the database
		//billsService.addJoshAllenToDatabase();
		//billsService.addTyrodTaylorToDatabase();


		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		while (true) {
			System.out.println("Please select the number corresponding with the position you would like to view");
			System.out.println("For QB's enter: 1");
			System.out.println("For RB's enter: 2");
			System.out.println("Enter 0 to exit the application");
			int choiceOne = scanner.nextInt();

			if (choiceOne == 1) {
				while (true) {
					System.out.println("Enter 1 to view stats, 2 to compare QBs, 3 to go back, or 0 to exit:");
					int choice = scanner.nextInt();
					switch (choice) {
						case 1:
							billsService.findQBByYear();
							break;
						case 2:
							billsService.compareQBs();
							break;
						case 3:
							break; // User chose to go back
						case 0:
							exit = true;
							System.out.println("Exiting...");
							break;
						default:
							System.out.println("Invalid choice. Try again.");
					}

					if (exit || choice == 3 || choice == 0) {
						break; // Exit the inner loop
					}
				}
				break; // Exiting the outer loop as the user has chosen QB
			} else if (choiceOne == 2) {
				rbServiceLayer.findRBByYear();
				break; // Exiting the outer loop as the user has chosen RB
			} else if (choiceOne == 0) {
				exit = true;
				System.out.println("Exiting...");
				break; // Exiting the outer loop as the user chose to exit
			} else {
				System.out.println("Invalid choice. Try again.");
			}
		}

		scanner.close(); }}
		// Closing the scanner after usage


		//Create Configuration  (No need since we are using application.properties
		//Configuration configuration=new Configuration();
		//configuration.configure("hibernate.cfg.xml");

		//Instead of manually creating a SessionFactory, you can inject the EntityManagerFactory or EntityManager directly into your repository or service beans
		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		//Session session=sessionFactory.openSession();


		//test to add additional users
		//BillsServiceLayer qb1= new BillsServiceLayer();
		//qbd.addJoshAllenToDatabase();








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