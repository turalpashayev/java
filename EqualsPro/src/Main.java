import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("VIP lounge entrance");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        //String Res1 = "yes";
        //String Res2 = "Yes";
        //String Res3 = "YES";

        int age = scanner.nextInt();


        if (age >= 18 ) {
            System.out.println("Do you have VIP pass?");
            String VipRes = scanner.next();

            if (VipRes.equals("yes") || age >= 70){
                System.out.print("Go on in!");
            }
            else {
                System.out.print("You must have a VIP card either over 70");
            }

        }
        else {
            System.out.print("You must be above 18");
        }

    }
}
