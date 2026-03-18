import java.util.LinkedList;
import java.util.List;

/**
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 * * Use Case 4: Maintain Ordered Bogie Consist
 * * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 * * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 * * This maps positional operations using LinkedList.
 * * @author Developer
 * @version 4.0
 */
public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=========================================\n");

        // 1. Create a LinkedList
        // LinkedList maintains insertion order and allows fast head/tail operations
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies in sequence (Building the initial train)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // 3. Insert a 'Pantry Car' at position 2 (0-indexed: Engine is 0, Sleeper is 1)
        // This demonstrates the ability to add a bogie in the middle of the consist
        trainConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        // 4. Remove the first and last bogie
        // removeFirst() detaches the Engine; removeLast() detaches the Guard coach
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed ...");
    }
}