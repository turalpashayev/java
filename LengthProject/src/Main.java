import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the total amount of the bill ?");
        Double totalBill = scanner.nextDouble();
        System.out.println("How many are you ?");
        Integer people = scanner.nextInt();
        System.out.format("Each person should pay amount of $%.1f", (totalBill / people));


    }
}
