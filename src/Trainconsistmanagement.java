/**
 * MAIN CLASS: UseCase15; TrainConsistMgmt
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * Description: This class demonstrates safe cargo assignment in a railway system.
 * At this stage, the application consists of:
 *  - Assigning cargo dynamically to goods bogies
 *  - Validating cargo safety based on bogie shape
 *  - Throwing a custom runtime exception for unsafe conditions
 *  - Handling exceptions using try-catch
 *  - Executing cleanup/logging using finally block
 *
 *  Ensures that:
 *  - Application does not crash during unsafe operations
 *  - User receives proper feedback
 *  - System continues execution after failure
 *
 * @author SHIVANSH DHINGRA
 * @version 1.0
 *
 */

public class TrainConsistMgmt {

    /**
     * Custom Runtime Exception for Cargo Safety
     */
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    /**
     * GoodsBogie Class
     */
    static class GoodsBogie {
        private String shape;
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        /**
         * Method to assign cargo with safety validation
         */
        public void assignCargo(String cargoType) {

            try {
                System.out.println("Assigning cargo: " + cargoType);

                // Validate unsafe condition
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargoType.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe cargo! Petroleum cannot be assigned to Rectangular bogie."
                    );
                }

                // Safe assignment
                cargo = cargoType;
                System.out.println("Cargo assigned successfully.");

            } catch (CargoSafetyException e) {

                // Handle exception
                System.out.println("Error: " + e.getMessage());

            } finally {

                // Always executes
                System.out.println("Assignment process completed.\n");
            }
        }

        /**
         * Display bogie details
         */
        public void displayDetails() {
            System.out.println("Bogie Shape : " + shape);
            System.out.println("Cargo       : " + (cargo != null ? cargo : "None"));
        }
    }

    /**
     * Main Method - Entry Point of Application
     */
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        // Create Goods Bogies
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        GoodsBogie bogie3 = new GoodsBogie("Rectangular");

        // Perform cargo assignments
        bogie1.assignCargo("Petroleum");  // Safe
        bogie2.assignCargo("Petroleum");  // Unsafe
        bogie3.assignCargo("Grain");      // Safe

        // Display final state
        System.out.println("Final Bogie Details:\n");

        bogie1.displayDetails();
        System.out.println();

        bogie2.displayDetails();
        System.out.println();

        bogie3.displayDetails();

        System.out.println("\nSystem continues running safely...");
    }
}