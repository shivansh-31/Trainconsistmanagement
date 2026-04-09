/**
 * MAIN CLASS: UseCase20; TrainConsistMgmt
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description: This class demonstrates defensive programming by
 * validating the state before performing a search operation.
 *
 * At this stage, the application consists of:
 *  - Creating an array of bogie IDs
 *  - Checking if the collection is empty before searching
 *  - Throwing IllegalStateException if no data exists
 *  - Performing search only when valid
 *  - Displaying appropriate result
 *
 *  Focus is on fail-fast behavior and runtime validation
 *
 * @author SHIVANSH DHINGRA
 * @version 1.0
 *
 */

public class TrainConsistMgmt {

    /**
     * Method to perform Linear Search with validation
     */
    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        // Defensive check (Fail-Fast)
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Main Method - Entry Point of Application
     */
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        // Example 1: Empty bogie list
        String[] emptyBogieList = {};

        try {
            System.out.println("Searching in empty train...");
            searchBogie(emptyBogieList, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example 2: Valid bogie list
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        System.out.println("\nSearching in available bogies...");
        boolean found = searchBogie(bogieIds, "BG205");

        if (found) {
            System.out.println("Bogie Found!");
        } else {
            System.out.println("Bogie Not Found!");
        }

        System.out.println("\nSearch operation completed safely...");
    }
}