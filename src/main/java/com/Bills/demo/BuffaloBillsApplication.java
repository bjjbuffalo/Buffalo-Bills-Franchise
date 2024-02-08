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

		// Get the ServiceLayer beans from the application context
		BillsServiceLayer billsService = context.getBean(BillsServiceLayer.class);				//.run(BuffaloBillsApplication.class, args)
		RBServiceLayer rbServiceLayer = context.getBean(RBServiceLayer.class);


		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		//Starting menu to choose what  stats to view for a specific position.  (Keep adding more)
		while (true) {
			System.out.println("-----------------------------------------------");
			System.out.println("Please select the number corresponding with the position you would like to view");
			System.out.println("For QB's enter: 1");
			System.out.println("For RB's enter: 2");
			System.out.println("Enter 0 to exit the application");
			int choiceOne = scanner.nextInt();

			if (choiceOne == 1) {
				while (true) {
					System.out.println("Enter 1 to view stats, 2 to compare QBs, or 0 to exit:");
					int choice = scanner.nextInt();
					switch (choice) {
						case 1:
							billsService.findQBByYear();
							break;
						case 2:
							billsService.compareQBs();
							break;
						case 0:
							exit = true;
							System.out.println("Exiting...");
							System.exit(0);
							break;
						default:
							System.out.println("Invalid choice. Try again.");
					}

					if (choice== 0) {
						break; // Exit the inner loop
					}
				}
				break;
			} else if (choiceOne == 2) {
				while (true) {
					rbServiceLayer.findRBByYear();
					break;
				}


			} else if (choiceOne == 0) {
				exit = true;
				System.out.println("Exiting...");
				System.exit(0);
				break;
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





