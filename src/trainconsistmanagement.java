/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 11: Validate Train ID & Cargo Code (Regex)
 *
 * Description:
 * Demonstrates validation of Train ID and Cargo Code
 * using Regular Expressions (Pattern & Matcher).
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code (Regex)");
        System.out.println("==================================================\n");

        Scanner scanner = new Scanner(System.in);

        // ----- INPUT FROM USER -----
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ----- DEFINE REGEX PATTERNS -----
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // ----- COMPILE PATTERNS -----
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // ----- MATCH INPUT -----
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // ----- VALIDATION -----
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // ----- DISPLAY RESULT -----
        System.out.println("\nValidation Results:\n");

        if (isTrainValid) {
            System.out.println("Train ID is VALID ✅");
        } else {
            System.out.println("Train ID is INVALID ❌");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }

        System.out.println("\nUC11 validation completed...");

        scanner.close();
    }
}