package com.Bills.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.ArrayList;
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

    // Logic to find RB by year
    public List<RBDataObjectService> findRBByYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year between 1960 and 2022: ");
        int year = scanner.nextInt();
        enteredYear=year;

        //Implement list as there are more than 1 rb every year
        List<RBDataObjectService> rb = rbRepository.findByYear(year);


        if (rb != null && !rb.isEmpty()) {
            //separators for easier reading
             System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");

         // Loop to list statistics for EACH runningback in a given year
            for (RBDataObjectService rbL : rb) {
                System.out.println("--------------------------------------");
                System.out.println("Player: " + rbL.getPlayer());
                System.out.println("");
               // System.out.println("Statistics:");
                System.out.println("");
                System.out.println("Attempts in the season: " + rbL.getAtt());
                System.out.println("Total Yards: " + rbL.getYards());
                System.out.println("");
                System.out.println("Average rushing yds per attempt: " + rbL.getRypa());
                System.out.println("Average rushing yds per game: " + rbL.getYpg());
                System.out.println("");
                System.out.println("Touchdowns: " + rbL.getTouchdowns());
                System.out.println("Fumbles: " + rbL.getFumbles());

            }
        } else {
            System.out.println("No RB's found for the year " + year);
        }
return rb;
    }

    }

