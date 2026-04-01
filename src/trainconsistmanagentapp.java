

/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * Demonstrates filtering bogies using Java Stream API
 * based on seating capacity conditions.
 * AUTHOR SHIVANSH DHINGRA
 */

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

// ----- MAIN CLASS -----
public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC8 - Filter Passenger Bogies (Stream API)");
        System.out.println("===============================================\n");

        // ----- CREATE LIST (Same as UC7) -----
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Luxury Coach", 80)); // extra example

        // ----- DISPLAY ORIGINAL LIST -----
        System.out.println("Original Bogie List:\n");
        bogieList.forEach(Bogie::display);

        // ----- FILTER USING STREAM -----
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60)   // CONDITION
                .collect(Collectors.toList()); // COLLECT RESULT

        // ----- DISPLAY FILTERED LIST -----
        System.out.println("\nFiltered Bogies (Capacity > 60):\n");

        if (filteredBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            filteredBogies.forEach(Bogie::display);
        }

        System.out.println("\nUC8 filtering completed...");
    }
}