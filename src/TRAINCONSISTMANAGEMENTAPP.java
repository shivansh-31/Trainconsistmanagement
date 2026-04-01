/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 9: Group Bogies by Type (Collectors.groupingBy)
 *
 * Description:
 * Demonstrates grouping of bogies into categories using Stream API.
 * AUTHOR SHIVANSH DHINGRA
 */

import java.util.*;
import java.util.stream.Collectors;

// ----- BOGIE CLASS -----
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("   Bogie: " + name + " | Capacity: " + capacity);
    }
}

// ----- MAIN CLASS -----
public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC9 - Group Bogies by Type (Stream API)");
        System.out.println("==================================================\n");

        // ----- CREATE LIST -----
        List<Bogie> bogieList = new ArrayList<>();

        // Adding multiple bogies (including duplicates for grouping demo)
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 72));      // duplicate type
        bogieList.add(new Bogie("AC Chair", 60));     // duplicate type

        // ----- DISPLAY ORIGINAL LIST -----
        System.out.println("Original Bogie List:\n");
        bogieList.forEach(b -> b.display());

        // ----- GROUPING USING STREAM -----
        Map<String, List<Bogie>> groupedBogies =
                bogieList.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // ----- DISPLAY GROUPED RESULT -----
        System.out.println("\nGrouped Bogies by Type:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                b.display();
            }
            System.out.println();
        }

        System.out.println("UC9 grouping completed...");
    }
}