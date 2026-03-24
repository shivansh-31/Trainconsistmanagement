/**
 * MAIN CLASS: UseCase6; TrainConsistMgmt
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description: This class maps each bogie to its seating or load capacity
 * using a HashMap. It allows storing and retrieving bogie-related data
 * efficiently using key–value pairs.
 *
 * At this stage, the application:
 *  - Associates bogies with their capacities
 *  - Stores data using HashMap
 *  - Prevents duplicate keys
 *  - Displays bogie-capacity mapping
 *
 * This use case demonstrates key–value mapping using HashMap.
 *
 * @author
 * @version 6.0
 *
 */

import java.util.HashMap;
import java.util.Map;

public class TrainConsistMgmt {

    /**
     * Main Method - Entry Point
     */
    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("===============================================\n");

        // HashMap to store bogie and its capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // ----- ADD BOGIES WITH CAPACITY -----
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 100);

        // ----- DISPLAY BOGIE CAPACITY -----
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nNote:");
        System.out.println("HashMap stores bogies as keys and capacities as values.");
        System.out.println("Allows fast lookup and efficient data management.");

        System.out.println("\nUC6 mapping setup completed...");
    }
}