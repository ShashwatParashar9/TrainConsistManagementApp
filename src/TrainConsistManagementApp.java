import java.util.Arrays;

/**
 * UC17: Sorting Bogie Names Using Arrays.sort()
 * This program demonstrates the transition from manual sorting algorithms
 * to optimized built-in Java utility methods.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Railway Consist Management System: UC17 ===");

        // Step 1: Initialize an array of Bogie Type Names
        // These represent different classes available in the train system.
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original state
        System.out.println("\n[Original Consist Order]");
        printBogieArray(bogieNames);

        // Step 2: Use Java's Built-in Arrays.sort()
        // This performs an optimized natural order (alphabetical) sort.
        Arrays.sort(bogieNames);

        // Step 3: Display Sorted Result
        // We use Arrays.toString() for a clean, concise output.
        System.out.println("\n[Sorted Consist Order (Alphabetical)]");
        System.out.println(Arrays.toString(bogieNames));

        // Testing specialized scenarios
        runEdgeCaseTests();

        System.out.println("\n" + "=".repeat(45));
        System.out.println("System Status: Operational (Optimized Sort Applied).");
    }

    /**
     * Helper method to simulate various test case scenarios
     */
    private static void runEdgeCaseTests() {
        System.out.println("\n--- Running Operational Edge Case Tests ---");

        // Test: Duplicate Names
        String[] duplicates = {"Sleeper", "AC Chair", "Sleeper", "General"};
        Arrays.sort(duplicates);
        System.out.println("Duplicate Check: " + Arrays.toString(duplicates));

        // Test: Single Element
        String[] single = {"Luxury"};
        Arrays.sort(single);
        System.out.println("Single Element Check: " + Arrays.toString(single));

        // Test: Already Sorted
        String[] sorted = {"AC Chair", "First Class", "General"};
        Arrays.sort(sorted);
        System.out.println("Pre-Sorted Check: " + Arrays.toString(sorted));
    }

    /**
     * Simple utility to print the array elements
     */
    private static void printBogieArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }
}