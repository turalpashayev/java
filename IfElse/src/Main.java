import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height ");
        int height = scanner.nextInt();
        if (height < 130 || height == 150) {
            System.out.print("Your height is too short!");
        }
        else if (height > 210) {
            System.out.println("Your height is too high!");
        }
        else {
            System.out.println("You good to go");
        }
    }
}
//
