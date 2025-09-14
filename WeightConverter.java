import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double KG_TO_LBS = 2.205;
        double LBS_TO_KG = 0.454;
        double To_Kg = 0.0;
        double To_Lbs = 0.0;

        System.out.print("Enter your choice: (KG) for k and (LBS) for l: ");
        String choice = input.nextLine().toLowerCase();

        if (choice.equals("k")) {
            System.out.print("Enter your weight in LBS: ");
            double lbs = input.nextDouble();
            To_Kg = lbs * LBS_TO_KG;
            System.out.printf("Your weight in KG: %.2f%n", To_Kg);

        } else if (choice.equals("l")) {
            System.out.print("Enter your weight in KG: ");
            double kg = input.nextDouble();
            To_Lbs = kg * KG_TO_LBS;
            System.out.printf("Your weight in LBS: %.2f%n", To_Lbs);

        } else {
            System.out.println("Please select (KG) or (LBS).");
        }

        input.close();
    }
}
