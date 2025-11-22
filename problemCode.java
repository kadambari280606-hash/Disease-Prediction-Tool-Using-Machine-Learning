import java.util.Scanner;

public class FluPredictor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Simple Flu Prediction Tool ---");
        System.out.println("Answer the following questions with 'yes' or 'no'.");

        // Collect user input for symptoms
        System.out.print("Do you have a high fever? (yes/no): ");
        String fever = scanner.nextLine().trim().toLowerCase();

        System.out.print("Do you have a severe cough? (yes/no): ");
        String cough = scanner.nextLine().trim().toLowerCase();

        System.out.print("Do you experience body aches? (yes/no): ");
        String aches = scanner.nextLine().trim().toLowerCase();

        // Perform the "prediction" based on simple logic
        String prediction = predictFlu(fever, cough, aches);

        System.out.println("\n--- Prediction Results ---");
        System.out.println(prediction);

        scanner.close();
    }

    /**
     * Simple decision logic function for flu prediction.
     */
    public static String predictFlu(String fever, String cough, String aches) {
        int symptomCount = 0;

        if (fever.equals("yes")) {
            symptomCount++;
        }
        if (cough.equals("yes")) {
            symptomCount++;
        }
        if (aches.equals("yes")) {
            symptomCount++;
        }

        if (symptomCount >= 2) {
            return "Prediction: HIGH chance of having the flu. Please consult a doctor.";
        } else {
            return "Prediction: LOW chance of having the flu based on these symptoms. It might be a common cold.";
        }
    }
}
