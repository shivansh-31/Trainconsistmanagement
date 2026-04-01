/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 10: Count Total Seats in Train (reduce)
 *
 * Description:
 * Demonstrates aggregation of bogie seating capacity
 * using Stream API and reduce() method.
 * author shivansh dhingra
 */

import java.util.ArrayList;
import java.util.List;

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

        System.out.println("==================================================");
        System.out.println("UC10 - Count Total Seats (Stream reduce)");
        System.out.println("==================================================\n");

        // ----- CREATE LIST -----
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Luxury Coach", 80));

        // ----- DISPLAY ORIGINAL LIST -----
        System.out.println("Bogie List:\n");
        bogieList.forEach(Bogie::display);

        // ----- AGGREGATION USING STREAM -----
        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)          // Extract capacity
                .reduce(0, Integer::sum);     // Aggregate (sum)

        // ----- DISPLAY RESULT -----
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}