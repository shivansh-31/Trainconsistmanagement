/**
 * MAIN CLASS: UseCase17; TrainConsistMgmt
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description: This class demonstrates sorting of bogie type names
 * using Java's built-in Arrays.sort() method.
 *
 * At this stage, the application consists of:
 *  - Creating an array of bogie type names
 *  - Sorting the bogie names alphabetically
 *  - Using optimized Java library method Arrays.sort()
 *  - Displaying sorted output using Arrays.toString()
 *
 *  No manual sorting logic is used (like Bubble Sort)
 *  Focus is on clean, efficient, and production-level coding
 *
 * @author SHIVANSH DHINGRA
 * @version 1.0
 *
 */

import java.util.Arrays;

public class TrainConsistMgmt {

    /**
     * Main Method - Entry Point of Application
     */
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        // Create array of bogie type names (unsorted)
        String[] bogieTypes = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original array
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        // Sort using built-in method
        Arrays.sort(bogieTypes);

        // Display sorted array
        System.out.println("\nAfter Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieTypes));

        System.out.println("\nSorting completed successfully...");
    }
}