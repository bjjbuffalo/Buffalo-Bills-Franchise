package com.Bills.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Scanner;
@Service
public class BillsServiceLayer {
    private final RepositoryInterface qbRepository;
    private QBDataObjectService currentQBData; // Declaring QBDataObjectService as an instance variable

    @Autowired
    public BillsServiceLayer(RepositoryInterface qbRepository) {  //inject repository interface object when creating bills service layer
        this.qbRepository = qbRepository;
    }

int enteredYear;

    // Logic to find QB by year
    public void findQBByYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year between 1960 and 2022: ");
        int year = scanner.nextInt();
        enteredYear=year;

//Instance of QBDataObjectService using repository to get data from specified year
        QBDataObjectService qb = qbRepository.retrievingYear(String.valueOf(year));

// displaying all stats from given year
        if (qb != null) {
            System.out.println("--------------------------------------");
            System.out.println("QB for the year " + year + ": " + qb.getPlayer());
            System.out.println("");
            System.out.println("Statistics:");
            System.out.println("Attempts: " + qb.getAttempts());
            System.out.println("Completions: " + qb.getCompletions());
            System.out.println("Completion Percentage: " + qb.getCompletionPercentage());
            System.out.println("Yards: " + qb.getYards());
            System.out.println("");
            System.out.println("Interceptions: " + qb.getInterceptions());
            System.out.println("Touchdowns: " + qb.getTouchdowns());
            System.out.println("");
            System.out.println("Rating: " + qb.getRating());
            System.out.println("--------------------------------------");

        } else {
            System.out.println("No QB found for the year " + year);
        }

    }


//2nd option, Compare two QB's
    public void compareQBs() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter two years to compare: ");
        System.out.println("First year:");
            int yearOne = scanner.nextInt();
        System.out.print("Second year:");
        int yearTwo = scanner.nextInt();

        //Fetch both years that the user selects
        QBDataObjectService qb = qbRepository.retrievingYear(String.valueOf(yearOne));
        QBDataObjectService qbTwo = qbRepository.retrievingYear(String.valueOf(yearTwo));
        System.out.println("______________________________________________________");

        //display results
        System.out.println(qb.getPlayer()+" in "+qb.getYear()+" had a QB rating of "+qb.getRating());
        System.out.println(qbTwo.getPlayer()+" in "+qbTwo.getYear()+" had a QB rating of "+qbTwo.getRating());
        System.out.println("");
        System.out.println(qb.getPlayer()+" in "+qb.getYear()+" had a completion percentage of "+qb.getCompletionPercentage());
        System.out.println(qbTwo.getPlayer()+" in "+qbTwo.getYear()+" had a completion percentage of "+qbTwo.getCompletionPercentage());
        System.out.println("");
        System.out.println(qb.getPlayer()+" in "+qb.getYear()+" threw for "+qb.getYards()+" yards");
        System.out.println(qbTwo.getPlayer()+" in "+qbTwo.getYear()+ " threw for "+qbTwo.getYards()+" yards");
        System.out.println("");
        System.out.println(qb.getPlayer()+" in "+qb.getYear()+" threw for "+qb.getTouchdowns()+" touchdowns");
        System.out.println(qbTwo.getPlayer()+" in "+qbTwo.getYear()+" threw for "+qbTwo.getTouchdowns()+" touchdowns");
       //compare touchdowns
        int touchdownsComparison = Integer.parseInt(qb.getTouchdowns()) - Integer.parseInt(qbTwo.getTouchdowns());
        System.out.println("Difference: "+touchdownsComparison);
        System.out.println("");
        System.out.println(qb.getPlayer()+" in "+qb.getYear()+" threw "+qb.getInterceptions()+" interceptions");
        System.out.println(qbTwo.getPlayer()+" in "+qbTwo.getYear()+ " threw "+qbTwo.getInterceptions()+" interceptions");
       //compare interceptions
        int interceptionComparison = Integer.parseInt(qb.getInterceptions()) - Integer.parseInt(qbTwo.getInterceptions());
        System.out.println("Difference: "+interceptionComparison);
        System.out.println("______________________________________________________");
    }}

