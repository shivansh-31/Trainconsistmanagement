/**
 * MAIN CLASS: UseCase5; TrainConsistMgmt
 * Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * Description: This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * At this stage, the application:
 *  - Attaches bogies in order
 *  - Preserves insertion sequence
 *  - Avoids duplicate bogies
 *  - Displays final train formation
 *
 * This use case demonstrates ordered uniqueness using LinkedHashSet.
 *
 * @author
 * @version 5.0
 *
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistMgmt {

    /**
     * Main Method - Entry Point
     */
    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===============================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ----- ADD BOGIES -----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Attempt to add duplicate
        formation.add("Sleeper"); // duplicate (ignored)

        // ----- DISPLAY FINAL FORMATION -----
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}