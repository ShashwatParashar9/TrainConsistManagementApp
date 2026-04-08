/**
 * UC16: Manual Sorting Using Bubble Sort
 * This program demonstrates algorithmic thinking by sorting passenger bogie
 * capacities using a manual comparison-and-swap logic.
 */

class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Railway Consist Management System: UC16 ===");

        // Step 1: Create an array of passenger bogie capacities
        // Sample data mimicking various classes: Sleeper, AC, etc.
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Initial Capacities: ");
        printArray(capacities);

        // Step 2: Execute Bubble Sort
        bubbleSort(capacities);

        // Step 3: Display Sorted Result
        System.out.print("Sorted Capacities (Ascending): ");
        printArray(capacities);

        // Final verification of program stability
        System.out.println("\nSorting complete. System operational.");
    }

    /**
     * Implementation of the Bubble Sort Algorithm.
     * Complexity: O(n²) - Ideal for educational understanding of nested loops.
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Outer loop: Number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop: Compare adjacent elements
            // The largest element "bubbles" to the end with each pass
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    // SWAP LOGIC: Use a temporary variable to exchange positions
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }

    /**
     * Utility method to print array contents
     */
    private static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }
}