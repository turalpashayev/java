import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] predictions = new String[3];
        int i = 0;
        System.out.println("Please enter 3 favorite food name: ");

        do {
            String input = scanner.nextLine();
            predictions[i] = input;
            i++;
        }
           while (i != 3);


        System.out.println("Maxiumum is tree");
        for (int t=0; t < predictions.length; t++){
            System.out.println("Entered foods: " + predictions[t]);
        }

        }


}
