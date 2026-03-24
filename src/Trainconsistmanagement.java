/**
 * MAIN CLASS: UseCase3; TrainConsistMgmt
 * Use Case 3: Track Unique Bogie IDs (Set – HashSet)
 *
 * Description: This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 *
 * At this stage, the application:
 *  - Stores bogie IDs
 *  - Prevents duplicates automatically
 *  - Displays unique bogie identifiers
 *
 * This use case introduces uniqueness validation using Set.
 *
 * @author SHIVANSH DHINGRA
 * @version 3.0
 *
 */

import java.util.HashSet;
import java.util.Set;

public class TrainConsistMgmt {

    /**
     * Main Method - Entry Point
     */
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // ----- ADD IDs (including duplicates) -----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored automatically)
        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        // ----- DISPLAY RESULT -----
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}