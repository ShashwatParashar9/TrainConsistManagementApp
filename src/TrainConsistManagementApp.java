import java.util.HashMap;
import java.util.Map;

/**
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 * * Use Case 6: Map Bogie to Capacity (HashMap)
 * * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 * * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 * * This maps Lookup-based access using HashMap.
 * * @author Developer
 * @version 6.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Display Header
        System.out.println("=========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("=========================================\n");

        // 1. Create a HashMap
        // String represents the Bogie Name (Key), Integer represents Capacity (Value)
        Map<String, Integer> capacityMap = new HashMap<>();

        // 2. ---- INSERT BOGIE CAPACITIES (put() method) ----
        // Key -> Value
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        // 3. ---- ITERATE AND DISPLAY ----
        System.out.println("Bogie Capacity Details:");

        // entrySet() allows us to access both key and value in a single loop
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed ...");
    }
}