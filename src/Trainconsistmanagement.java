/**
 * MAIN CLASS: UseCase4; TrainConsistMgmt
 * Use Case 4: Maintain Ordered Bogie Consist (LinkedList)
 *
 * Description: This class models the physical chaining of train bogies
 * using LinkedList to maintain order and allow efficient insertions
 * and deletions.
 *
 * At this stage, the application:
 *  - Adds bogies in sequence
 *  - Inserts bogies at specific positions
 *  - Removes bogies from front and rear
 *  - Displays updated train structure
 *
 * This use case demonstrates ordered operations using LinkedList.
 *
 * @author
 * @version 4.0
 *
 */

import java.util.LinkedList;
import java.util.List;

public class TrainConsistMgmt {

    /**
     * Main Method - Entry Point
     */
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=====================================\n");

        // Create a LinkedList to maintain order
        List<String> trainConsist = new LinkedList<>();

        // ----- INITIAL ADD -----
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ----- INSERT AT POSITION -----
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // ----- REMOVE FIRST & LAST -----
        trainConsist.remove(0); // remove first (Engine)
        trainConsist.remove(trainConsist.size() - 1); // remove last (Guard)

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}