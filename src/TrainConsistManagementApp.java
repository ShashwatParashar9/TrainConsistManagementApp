import java.util.Arrays;

/**
 * UC19: Binary Search for Bogie ID (Optimized Searching)
 * This program demonstrates the Divide-and-Conquer strategy for searching.
 * Precondition: The array MUST be sorted for Binary Search to function.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Railway Consist Management System: UC19 ===");

        // Step 1: Initialize Bogie IDs (Note: Unsorted to test the precondition)
        String[] bogieInventory = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Pre-process the data
        // Binary search requires sorted data. We use Arrays.sort() from UC17.
        System.out.println("System: Sorting bogie IDs to meet Binary Search preconditions...");
        Arrays.sort(bogieInventory);
        System.out.println("Sorted Inventory: " + Arrays.toString(bogieInventory));

        // Step 3: Define search targets for Test Cases
        String targetMid = "BG309";  // Mid-range match
        String targetFirst = "BG101"; // First element (low end)
        String targetLast = "BG550";  // Last element (high end)
        String targetNone = "BG999";  // Not found

        // Step 4: Execute Binary Search for each scenario
        performBinarySearch(bogieInventory, targetMid);
        performBinarySearch(bogieInventory, targetFirst);
        performBinarySearch(bogieInventory, targetLast);
        performBinarySearch(bogieInventory, targetNone);

        // Step 5: Edge Case - Empty Array
        System.out.println("\n--- Testing Empty Array Handling ---");
        performBinarySearch(new String[]{}, "BG101");

        System.out.println("\n" + "=".repeat(45));
        System.out.println("Optimization Complete: Search operations are now O(log n).");
    }

    /**
     * Binary Search implementation using Divide-and-Conquer logic.
     */
    public static void performBinarySearch(String[] sortedArray, String searchKey) {
        System.out.print("\nSearching for [" + searchKey + "]: ");

        int low = 0;
        int high = sortedArray.length - 1;
        int foundIndex = -1;
        int steps = 0;

        while (low <= high) {
            steps++;
            int mid = low + (high - low) / 2;

            // String comparison using compareTo()
            // result < 0: searchKey comes before mid
            // result > 0: searchKey comes after mid
            // result == 0: match found
            int comparison = searchKey.compareTo(sortedArray[mid]);

            if (comparison == 0) {
                foundIndex = mid;
                break; // Target found
            } else if (comparison < 0) {
                high = mid - 1; // Discard right half
            } else {
                low = mid + 1;  // Discard left half
            }
        }

        if (foundIndex != -1) {
            System.out.println("SUCCESS! Found at index " + foundIndex + " (Steps taken: " + steps + ")");
        } else {
            System.out.println("NOT FOUND. Searched entire range in " + steps + " steps.");
        }
    }
}