/**
 * MAIN CLASS: UseCase18; TrainConsistMgmt
 * Use Case 18: Linear Search for Bogie ID (Array-Based Searching)
 *
 * Description: This class demonstrates searching for a specific bogie ID
 * using Linear Search on an unsorted array.
 *
 * At this stage, the application consists of:
 *  - Creating an array of bogie IDs
 *  - Accepting a search key (bogie ID)
 *  - Traversing the array sequentially
 *  - Comparing each element using equals()
 *  - Stopping search when match is found
 *  - Displaying search result
 *
 *  No sorting is required before searching
 *  Focus is on basic search logic and traversal
 *
 * @author SHIVANSH DHINGRA
 * @version 1.0
 *
 */

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
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Search key
        String searchKey = "BG309";

        // Display bogie list
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        System.out.println("\n\nSearching for Bogie ID: " + searchKey);

        // Linear Search Logic
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie Found at position: " + i);
                break; // Early termination
            }
        }

        // Result display
        if (!found) {
            System.out.println("Bogie ID not found in the consist.");
        }

        System.out.println("\nSearch operation completed...");
    }
}