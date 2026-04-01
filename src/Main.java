/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class demonstrates sorting of passenger bogies
 * using Comparator based on seating capacity.
 * author Shivansh
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


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

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("===============================================\n");


        List<Bogie> bogieList = new ArrayList<>();


        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));


        System.out.println("Before Sorting:\n");
        for (Bogie b : bogieList) {
            b.display();
        }


        bogieList.sort(Comparator.comparingInt(b -> b.capacity));


        System.out.println("\nAfter Sorting (By Capacity - Ascending):\n");
        for (Bogie b : bogieList) {
            b.display();
        }


        bogieList.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nAfter Sorting (By Capacity - Descending):\n");
        for (Bogie b : bogieList) {
            b.display();
        }

        System.out.println("\nUC7 sorting completed...");
    }
}