import java.util.Arrays;

/**
 * UC20: Exception Handling During Search Operations
 * This program demonstrates defensive programming by ensuring the system
 * is in a valid state (non-empty) before performing search operations.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Railway Consist Management System: UC20 ===");

        // Scenario 1: Search Allowed When Data Exists
        String[] activeTrain = {"BG101", "BG205", "BG309"};
        System.out.println("\n--- Scenario 1: Searching a Populated Train ---");
        try {
            boolean found = validateAndSearch(activeTrain, "BG205");
            System.out.println("Search Result: " + (found ? "Bogie Found" : "Bogie Not Found"));
        } catch (IllegalStateException e) {
            System.out.println("CAUGHT: " + e.getMessage());
        }

        // Scenario 2: Exception When Empty Data (The Fail-Fast Scenario)
        // This simulates a train with no bogies attached to the engine yet.
        String[] emptyTrain = {};
        System.out.println("\n--- Scenario 2: Searching an Empty Train ---");
        try {
            validateAndSearch(emptyTrain, "BG101");
        } catch (IllegalStateException e) {
            // Intercepting the state exception to prevent program crash
            System.out.println("CAUGHT: " + e.getMessage());
        }

        // Scenario 3: Search Match Not Found After Validation
        System.out.println("\n--- Scenario 3: Search Key Missing ---");
        try {
            boolean found = validateAndSearch(activeTrain, "BG999");
            System.out.println("Search Result: " + (found ? "Bogie Found" : "Bogie Not Found"));
        } catch (IllegalStateException e) {
            System.out.println("CAUGHT: " + e.getMessage());
        }

        System.out.println("\n" + "=".repeat(45));
        System.out.println("Defensive Check Complete: System state validated.");
    }

    /**
     * Performs a search but validates the state of the array first.
     * Demonstrates the Fail-Fast principle by throwing an exception early.
     * * @param bogies The array of bogie IDs
     * @param searchKey The ID to find
     * @return true if found, false otherwise
     * @throws IllegalStateException if the bogie array is empty
     */
    public static boolean validateAndSearch(String[] bogies, String searchKey) {
        // STEP 1: State Validation (Defensive Programming)
        // We fail fast here before any search logic executes.
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("CRITICAL ERROR: Cannot perform search. The train consist is empty!");
        }

        // STEP 2: Logic Execution (Only reached if validation passes)
        System.out.println("Validation Passed: Scanning " + bogies.length + " bogie(s)...");

        for (String id : bogies) {
            if (id.equals(searchKey)) {
                return true; // Match found
            }
        }

        return false; // Match not found
    }
}