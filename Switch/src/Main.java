import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of your pets ");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("You entered one.");
                break;
            case 2:
                System.out.println("You entered two");
                break;
            default:
                System.out.println("You entered invalid number");
                break;
        }

    /*    if (num == 1){

        }
        else if (num == 2){

        }
        else {

        } */

    }
}
