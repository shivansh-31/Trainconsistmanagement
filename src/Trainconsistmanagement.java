/**
 * MAIN CLASS: UseCase19; TrainConsistMgmt
 * Use Case 19: Binary Search for Bogie ID (Optimized Searching)
 *
 * Description: This class demonstrates searching for a bogie ID
 * using Binary Search on sorted data.
 *
 * At this stage, the application consists of:
 *  - Creating an array of bogie IDs
 *  - Sorting the array (precondition for Binary Search)
 *  - Applying Binary Search using low, high, and mid indexes
 *  - Comparing values using compareTo()
 *  - Narrowing search range using divide-and-conquer
 *  - Displaying search result
 *
 *  Focus is on efficient searching using O(log n) complexity
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

        // Create array of bogie IDs (unsorted)
        String[] bogieIds = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        // Search key
        String searchKey = "BG205";

        // Display original array
        System.out.println("Original Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Step 1: Sort the array (required for Binary Search)
        Arrays.sort(bogieIds);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Binary Search Logic
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                System.out.println("\nBogie Found at position: " + mid);
                break;
            }
            else if (comparison > 0) {
                low = mid + 1;   // Search right half
            }
            else {
                high = mid - 1;  // Search left half
            }
        }

        // Result display
        if (!found) {
            System.out.println("\nBogie ID not found in the consist.");
        }

        System.out.println("\nBinary Search operation completed...");
    }
}