import java.util.ArrayList;
import java.util.List;

/**
 * Use Case 1: Initialize Train and Display Consist Summary
 * * Description:
 * This class represents the entry point of the Train Consist Management Application.
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 * * @author Developer
 * @version 1.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 1. Display welcome banner
        System.out.println("=========================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("=========================================\n");

        // 2. Create a dynamic List to store train bogies (using Generics)
        // We use the List interface for abstraction and ArrayList for dynamic resizing
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initial consist information
        System.out.println("Train initialized successfully ... ");

        // 4. Display the initial bogie count using size()
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // 5. Print the current state (empty list representation)
        System.out.println("Current Train Consist : " + trainConsist);

        // 6. Readiness message
        System.out.println("\nSystem ready for operations ...");
    }
}