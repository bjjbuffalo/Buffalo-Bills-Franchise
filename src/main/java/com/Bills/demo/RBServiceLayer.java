package com.Bills.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Scanner;
@Service
public class RBServiceLayer {
    private final RBRepositoryInterface rbRepository;
    private RBDataObjectService currentRBData; // Declaring RBDataObjectService as an instance variable

    @Autowired
    public RBServiceLayer(RBRepositoryInterface rbRepository) {  //inject repository interface object when creating bills service layer
        this.rbRepository = rbRepository;
    }

    int enteredYear;

    // Logic to find QB by year
    public void findRBByYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        enteredYear=year;

        RBDataObjectService rb = rbRepository.retrievingYear(year);


        if (rb != null) {
            System.out.println("--------------------------------------");
            System.out.println("" + "RB's for the year " + year + ": " + rb.getPlayer());
            System.out.println("");
            System.out.println("Statistics:");
            System.out.println("");
            System.out.println("Attempts in the season: " + rb.getAtt());
            System.out.println("Total Yards: " + rb.getYards());
            System.out.println("");
            System.out.println("Average rushing yds per attempt: " + rb.getRypa());
            System.out.println("Average rushing yds per game: " + rb.getYpg());
            System.out.println("");
            System.out.println("Touchdowns: " + rb.getTouchdowns());
            System.out.println("Fumbles: " + rb.getFumbles());
            System.out.println("--------------------------------------");

        } else {
            System.out.println("No RB's found for the year " + year);
        }

    }

    }

