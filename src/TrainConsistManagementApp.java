import java.util.LinkedHashSet;
import java.util.Set;

/**
 * MAIN CLASS - UseCase5TrainConsistMgmnt
 * * Use Case 5: Preserve Insertion Order of Bogies
 * * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 * * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 * * This maps ordered uniqueness using LinkedHashSet.
 * * @author Developer
 * @version 5.0
 */
public class UseCase5TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display Header
        System.out.println("=========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=========================================\n");

        // 1. Create a LinkedHashSet
        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // 2. ---- ATTACH BOGIES (Add in specific sequence) ----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // 3. ---- ATTEMPT DUPLICATE ATTACHMENT ----
        // This simulates a mistake where a yard worker tries to add a bogie
        // that is already part of the train.
        formation.add("Sleeper"); // Duplicate entry - will be ignored

        // 4. Display the final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically");

        System.out.println("\nUC5 formation setup completed ...");
    }
}