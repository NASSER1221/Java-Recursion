import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class InputCollector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> allergies = new ArrayList<>();
        System.out.println("Enter allergies one by one. Press 'q' to quit.");
        String input = "";
        // --- START OF BLOCK TO REPLACE ---
            input+=collectInputsRecursive(scanner,allergies);
        // --- END OF BLOCK TO REPLACE ---
        System.out.println("\n--- Collected Allergies ---");
        for (String allergy : allergies) {
            System.out.println("- " + allergy);
        }
        scanner.close();
    }
     public static List<String> collectInputsRecursive(Scanner sc, List<String> currentList) {

        sc=new Scanner(System.in);
         System.out.println("Enter the allergy");
         String input= sc.nextLine();
         if(input.equalsIgnoreCase("q")) return currentList;

         else {

            currentList.add(input);
         }
         return collectInputsRecursive(sc,currentList);
     }


}

