/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * Description:
 * Compares execution time of loop-based filtering
 * vs stream-based filtering using System.nanoTime().
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
}

// ----- MAIN CLASS -----
public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC13 - Performance Comparison (Loop vs Stream)");
        System.out.println("==================================================\n");

        // ----- CREATE LARGE DATASET -----
        List<Bogie> bogieList = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogieList.add(new Bogie("Sleeper", 72));
            bogieList.add(new Bogie("AC Chair", 60));
            bogieList.add(new Bogie("First Class", 24));
        }

        // ==================================================
        // LOOP-BASED FILTERING
        // ==================================================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogieList) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ==================================================
        // STREAM-BASED FILTERING
        // ==================================================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ==================================================
        // RESULTS
        // ==================================================
        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time   (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        // ----- COMPARISON -----
        if (loopTime < streamTime) {
            System.out.println("\nLoop is faster in this run ⚡");
        } else if (streamTime < loopTime) {
            System.out.println("\nStream is faster in this run ⚡");
        } else {
            System.out.println("\nBoth performed equally.");
        }

        System.out.println("\nUC13 performance comparison completed...");
    }
}