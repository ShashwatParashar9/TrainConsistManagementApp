import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase2TrainConsistMgmnt
 * * Use Case 2: Add Passenger Bogies to Train
 * * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 * * At this stage, the application:
 * - Adds new bogies to the train (Create)
 * - Removes existing bogies (Delete)
 * - Checks for bogie availability (Read)
 * - Displays the final consist
 * * @author Developer
 * @version 2.0
 */
public class TrainConsistManagementApp{

    public static void main(String[] args) {

        // Display Header
        System.out.println("=========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("=========================================\n");

        // 1. Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. ---- CREATE (Add bogies) ----
        // add() attaches a new bogie to the end of the train
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);
        System.out.println();

        // 3. ---- DELETE (Remove bogie) ----
        // remove() simulates decoupling a specific bogie
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);
        System.out.println();

        // 4. ---- READ (Check existence) ----
        // contains() checks if a specific bogie is currently in the consist
        System.out.println("Checking if 'Sleeper' exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + hasSleeper);
        System.out.println();

        // 5. Final Consist Display
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully ...");
    }
}