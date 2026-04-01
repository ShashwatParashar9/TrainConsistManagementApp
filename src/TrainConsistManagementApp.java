import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC11: Train Consist Management App - Regex Validation
 * This file handles format enforcement for Train IDs and Cargo Codes.
 */
public class TrainConsistManagementApp {

    // --- Regex Patterns (Key Concepts) ---
    // TRN- followed by exactly 4 digits
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";

    // PET- followed by exactly 2 uppercase letters
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    // Pre-compiling patterns for efficiency (Pattern Class)
    private static final Pattern trainPattern = Pattern.compile(TRAIN_ID_REGEX);
    private static final Pattern cargoPattern = Pattern.compile(CARGO_CODE_REGEX);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   TRAIN CONSIST MANAGEMENT SYSTEM (UC11)    ");
        System.out.println("      Input Validation using Regex           ");
        System.out.println("==============================================\n");

        // 1. Validate Train ID
        System.out.print("Enter Train ID (Format: TRN-XXXX): ");
        String trainID = scanner.nextLine();
        validateAndDisplayTrainID(trainID);

        System.out.println("----------------------------------------------");

        // 2. Validate Cargo Code
        System.out.print("Enter Cargo Code (Format: PET-XX): ");
        String cargoCode = scanner.nextLine();
        validateAndDisplayCargoCode(cargoCode);

        System.out.println("\n==============================================");
        System.out.println("Validation Process Complete.");

        scanner.close();
    }

    /**
     * Logic for validating Train ID using Matcher Class
     */
    private static void validateAndDisplayTrainID(String input) {
        // Create Matcher object for user input
        Matcher matcher = trainPattern.matcher(input);

        // Use matches() to verify entire string conforms exactly
        if (matcher.matches()) {
            System.out.println("✅ VALID: Train ID '" + input + "' matches the required format.");
        } else {
            System.out.println("❌ INVALID: '" + input + "' is not a valid Train ID.");
            System.out.println("   Requirement: Must start with 'TRN-' followed by exactly 4 digits.");
        }
    }

    /**
     * Logic for validating Cargo Code using Matcher Class
     */
    private static void validateAndDisplayCargoCode(String input) {
        Matcher matcher = cargoPattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("✅ VALID: Cargo Code '" + input + "' matches the required format.");
        } else {
            System.out.println("❌ INVALID: '" + input + "' is not a valid Cargo Code.");
            System.out.println("   Requirement: Must start with 'PET-' followed by exactly 2 uppercase letters.");
        }
    }
}