/**
 * UC15: Safe Cargo Assignment Using try-catch-finally
 * This program demonstrates structured exception handling in a
 * Train Consist Management context.
 */

// 1. Custom Runtime Exception
// We use RuntimeException so the safety checks happen dynamically during operation.
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// 2. The GoodsBogie class with safety validation logic
class GoodsBogie {
    private String bogieId;
    private String shape; // "Rectangular" or "Cylindrical"
    private String currentCargo;

    public GoodsBogie(String bogieId, String shape) {
        this.bogieId = bogieId;
        this.shape = shape;
        this.currentCargo = "Empty";
    }

    /**
     * Attempts to assign cargo using a try-catch-finally block.
     * This prevents the entire train system from crashing if one assignment is invalid.
     */
    public void assignCargo(String cargoType) {
        System.out.println("\n>>> Processing Assignment: " + cargoType + " to " + bogieId + " (" + shape + ")");

        try {
            // STEP 1: Validation Logic
            // Petroleum is volatile and requires a Cylindrical container for safety.
            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("CRITICAL SAFETY VIOLATION: Petroleum cannot be stored in Rectangular bogies!");
            }

            // STEP 2: Success path
            this.currentCargo = cargoType;
            System.out.println("SUCCESS: Cargo '" + cargoType + "' secured in " + bogieId + ".");

        } catch (CargoSafetyException e) {
            // STEP 3: Handle the failure without crashing the app
            System.out.println("CAUGHT EXCEPTION: " + e.getMessage());
            System.out.println("ACTION: Assignment aborted. Bogie " + bogieId + " remains " + currentCargo + ".");

        } finally {
            // STEP 4: Mandatory execution (Logging/Cleanup)
            System.out.println("CLEANUP: Safety check protocol finalized for " + bogieId + ".");
        }
    }

    public String getStatus() {
        return "Bogie ID: " + bogieId + " | Shape: " + shape + " | Cargo: " + currentCargo;
    }
}

// 3. Main Application Entry Point
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Railway Consist Management System: UC15 ===");

        // Initialize bogies
        GoodsBogie tankBogie = new GoodsBogie("GB-VOL-01", "Cylindrical");
        GoodsBogie crateBogie = new GoodsBogie("GB-GEN-02", "Rectangular");

        // --- Scenario 1: Safe Assignment ---
        // Placing petroleum in a cylindrical bogie is safe.
        tankBogie.assignCargo("Petroleum");

        // --- Scenario 2: Unsafe Assignment (Handled) ---
        // Placing petroleum in a rectangular bogie triggers our custom exception.
        crateBogie.assignCargo("Petroleum");

        // --- Scenario 3: Valid Assignment to Rectangular ---
        // Placing generic cargo in a rectangular bogie is safe.
        crateBogie.assignCargo("Electronics");

        // Verify System Stability
        System.out.println("\n" + "=".repeat(45));
        System.out.println("FINAL TRAIN CONSIST STATUS:");
        System.out.println(tankBogie.getStatus());
        System.out.println(crateBogie.getStatus());
        System.out.println("=".repeat(45));
        System.out.println("System Status: Operational (No crashes detected).");
    }
}