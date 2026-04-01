/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * Validates whether goods bogies follow safety rules:
 * Cylindrical bogies must carry only Petroleum.
 */

import java.util.ArrayList;
import java.util.List;

// ----- GOODS BOGIE CLASS -----
class GoodsBogie {
    String type;   // e.g., Cylindrical, Open, Box
    String cargo;  // e.g., Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public void display() {
        System.out.println("Bogie Type: " + type + " | Cargo: " + cargo);
    }
}

// ----- MAIN CLASS -----
public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC12 - Safety Compliance Check (Goods Bogies)");
        System.out.println("==================================================\n");

        // ----- CREATE GOODS BOGIE LIST -----
        List<GoodsBogie> goodsList = new ArrayList<>();

        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Open", "Coal"));
        goodsList.add(new GoodsBogie("Box", "Grain"));
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Try changing to "Coal" to test failure case

        // ----- DISPLAY DATA -----
        System.out.println("Goods Bogie Details:\n");
        goodsList.forEach(GoodsBogie::display);

        // ----- SAFETY VALIDATION USING STREAM -----
        boolean isSafe = goodsList.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // ----- DISPLAY RESULT -----
        System.out.println("\nSafety Validation Result:\n");

        if (isSafe) {
            System.out.println("Train is SAFE for operation ✅");
        } else {
            System.out.println("Train is UNSAFE ❌ (Invalid cargo in cylindrical bogie)");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}