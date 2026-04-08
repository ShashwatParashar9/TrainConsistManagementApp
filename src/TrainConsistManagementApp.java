/**
 * UC18: Linear Search for Bogie ID
 * This program demonstrates sequential searching through an array of bogie IDs.
 * It handles both sorted and unsorted data by checking each element one by one.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Railway Consist Management System: UC18 ===");

        // Step 1: Initialize an array of Bogie IDs
        // Linear search does not require the data to be sorted.
        String[] bogieInventory = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Define search targets based on Test Case Examples
        String searchTarget1 = "BG309"; // Mid-element match
        String searchTarget2 = "BG999"; // Not found case
        String searchTarget3 = "BG101"; // First element match
        String searchTarget4 = "BG550"; // Last element match

        // Step 2: Perform search operations
        System.out.println("\n--- Starting Search Operations ---");

        findBogie(bogieInventory, searchTarget1);
        findBogie(bogieInventory, searchTarget2);
        findBogie(bogieInventory, searchTarget3);
        findBogie(bogieInventory, searchTarget4);

        // Scenario: Single element array test
        String[] singleBogieArr = {"BG101"};
        System.out.println("\n--- Single Element Array Test ---");
        findBogie(singleBogieArr, "BG101");

        System.out.println("\n" + "=".repeat(45));
        System.out.println("Search process completed. All systems operational.");
    }

    /**
     * Linear Search Algorithm implementation.
     * @param array The list of bogie IDs to search through.
     * @param searchKey The ID we are looking for.
     */
    public static void findBogie(String[] array, String searchKey) {
        boolean found = false;
        int indexFound = -1;

        System.out.print("Searching for " + searchKey + ": ");

        // Sequential Traversal
        for (int i = 0; i < array.length; i++) {
            // Equality Comparison using .equals() for String safety
            if (array[i].equals(searchKey)) {
                found = true;
                indexFound = i;

                // EARLY TERMINATION: Match found, stop traversing immediately.
                break;
            }
        }

        // Display results to user
        if (found) {
            System.out.println("MATCH FOUND! Bogie " + searchKey + " is at index " + indexFound + ".");
        } else {
            System.out.println("NOT FOUND. Bogie " + searchKey + " does not exist in this consist.");
        }
    }
}