/**
 * MAIN CLASS: UseCase1; TrainConsistMgmt
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description: This class represents the entry point of the Train Consist Management System.
 * At this stage, the application consists of:
 *  - Execution begins in the main() method
 *  - Displays welcome message of the application
 *  - Initializes an empty train consist using ArrayList
 *  - Displays initial bogie count
 *  - Prints the current state of the train
 *
 *  No bogie addition logic has been implemented yet
 *  Our goal is to establish application startup flow and initialization
 *
 * @author SHIVANSH DHINGRA
 * @version 1.0
 *
 */

import java.util.ArrayList;
import java.util.List;

public class TrainConsistMgmt {

    /**
     * Main Method - Entry Point of Application
     */
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}