package com.Bills.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Scanner;
@Service
public class BillsServiceLayer {
    private final RepositoryInterface qbRepository;

    @Autowired
    public BillsServiceLayer(RepositoryInterface qbRepository) {
        this.qbRepository = qbRepository;
    }

    // ... (other methods)

    // Logic to find QB by year
    public void findQBByYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        QBDataObjectService qb = qbRepository.findByYear(String.valueOf(year));

        if (qb != null) {
            System.out.println("QB for " + year + ": " + qb.getPlayer());

            // Display the entire line of stats
            System.out.println("Year: " + qb.getYear());
            System.out.println("Player: " + qb.getPlayer());
            System.out.println("Attempts: " + qb.getAttempts());
            System.out.println("Completions: " + qb.getCompletions());
            System.out.println("Completion Percentage: " + qb.getCompletionPercentage());
            System.out.println("Yards: " + qb.getYards());
            System.out.println("Interceptions: " + qb.getInterceptions());
            System.out.println("Touchdowns: " + qb.getTouchdowns());
            System.out.println("Rating: " + qb.getRating());
        } else {
            System.out.println("No QB found for the year " + year);
        }
    }
}
