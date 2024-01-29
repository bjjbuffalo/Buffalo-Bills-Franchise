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

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        enteredYear=year;

        QBDataObjectService qb = qbRepository.retrievingYear(String.valueOf(year));


        if (qb != null) {
            System.out.println("--------------------------------------");
            System.out.println("QB for the year " + year + ": " + qb.getPlayer());
            System.out.println("");
            System.out.println("Statistics:");
            // Display the entire line of stats
            //System.out.println("Year: " + qb.getYear());
            //System.out.println("Player: " + qb.getPlayer());
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

    //public void compareQBs() {
        //QBDataObjectService currentQB = findQBByYear();

        // Specific comparison logic for touchdowns
       // int currentTouchdowns = Integer.parseInt(currentQBData.getTouchdowns());
      //  int otherTouchdowns = Integer.parseInt(findQBByYear().getTouchdowns());

       // Scanner scanner = new Scanner(System.in);

       // System.out.print("Enter a year to compare with " + enteredYear + ": ");
       // int newYear = scanner.nextInt();
        //QBDataObjectService qb2 = qbRepository.retrievingYear(String.valueOf(newYear));
        //if (qb2 != null) {
           // System.out.println("Touchdowns: " + qb2.getTouchdowns());
           // int touchdownsComparison = Integer.parseInt(currentQB.getTouchdowns()) - Integer.parseInt(qb2.getTouchdowns());
           // System.out.println("result?"+touchdownsComparison);
           // System.out.println(currentQB.getPlayer()+ " in " + enteredYear + " threw for " +);


            //QBDataObjectService otherQBData = qbRepository.retrievingYear(String.valueOf(otherYear));
            //int touchdownsComparison = currentTouchdowns - otherTouchdowns;
            //System.out.println("Touchdowns Comparison: " + touchdownsComparison);

    public void compareQBs() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter two years to compare: ");
        System.out.println("First year:");
            int yearOne = scanner.nextInt();
        System.out.print("Second year:");
        int yearTwo = scanner.nextInt();

        QBDataObjectService qb = qbRepository.retrievingYear(String.valueOf(yearOne));
        QBDataObjectService qbTwo = qbRepository.retrievingYear(String.valueOf(yearTwo));
        System.out.println("______________________________________________________");
        System.out.println(qb.getPlayer()+" in "+qb.getYear()+" threw for "+qb.getTouchdowns()+" touchdowns");
        System.out.println(qbTwo.getPlayer()+" in "+qbTwo.getYear()+" threw for "+qbTwo.getTouchdowns()+" touchdowns");
         int touchdownsComparison = Integer.parseInt(qb.getTouchdowns()) - Integer.parseInt(qbTwo.getTouchdowns());
        System.out.println("Difference: "+touchdownsComparison);


    }}

