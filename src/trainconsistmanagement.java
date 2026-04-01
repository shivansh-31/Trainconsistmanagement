/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 *
 * Description:
 * Prevents creation of passenger bogies with invalid capacity
 * using a custom checked exception.
 */

import java.util.ArrayList;
import java.util.List;

// ----- CUSTOM EXCEPTION -----
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// ----- PASSENGER BOGIE CLASS -----
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie Type: " + type + " | Capacity: " + capacity);
    }
}

// ----- MAIN CLASS -----
public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("==================================================\n");

        List<PassengerBogie> bogieList = new ArrayList<>();

        try {
            // ----- VALID BOGIES -----
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);

            bogieList.add(b1);
            bogieList.add(b2);

            // ----- INVALID BOGIE (TEST CASE) -----
            PassengerBogie b3 = new PassengerBogie("First Class", 0); // will throw exception
            bogieList.add(b3);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught ❌: " + e.getMessage());
        }

        // ----- DISPLAY VALID BOGIES ONLY -----
        System.out.println("\nValid Bogies in Train:\n");
        for (PassengerBogie b : bogieList) {
            b.display();
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}