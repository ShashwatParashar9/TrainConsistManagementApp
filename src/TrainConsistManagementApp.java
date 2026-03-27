import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    // Goods Bogie class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC12 - Safety Validation Using Streams");
        System.out.println("=======================================\n");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Grain"));

        // Display bogies
        System.out.println("Goods Bogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b.type + " -> " + b.cargo);
        }

        // SAFETY CHECK using allMatch (IMPORTANT ⭐)
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical → only Petroleum allowed
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Output result
        System.out.println("\nSafety Check Result:");
        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        System.out.println("\nUC12 validation completed...");
    }
}