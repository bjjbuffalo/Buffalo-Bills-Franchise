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

    // Logic to find QB by year
    public List<RBDataObjectService> findRBByYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year between 1960 and 2022: ");
        int year = scanner.nextInt();
        enteredYear=year;

        List<RBDataObjectService> rb = rbRepository.findByYear(year);


        if (rb != null && !rb.isEmpty()) {
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");

            // System.out.println("RB's for the year " + year + ": ");

            ///////////////
            // Print the size of the result list
         //   System.out.println("Number of RBs: " + rb.size());

// Print the RB list contents
          //  System.out.println("RB List Contents: " + rb);

// Iterate over the result list and print individual RB data
          //  for (RBDataObjectService rbL : rb) {
              //  System.out.println("Object Hash Code: " + System.identityHashCode(rbL));
                // Rest of your processing
           // }

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

