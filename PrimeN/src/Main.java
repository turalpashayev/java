import java.util.Scanner;

public class Main {
    static String[] list = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 1;
        addTestNames();

        do {
            DisplayGuests();
            DisplayMenu();
            option = getOption();
            if (option == 1) {
                addGuest();
            }
            else if (option == 2){
                insertGuest();;
            }
            else if (option == 3){
                remGuest();
            }
            else if (option == 4){
                renameGuest();
            }

            else if (option == 5) {
                System.out.println("Exiting...");
                    break;
                }
            }

        while(true);
    }

    static void DisplayGuests (){
        System.out.println("______________________________");
        System.out.println("- Guests -\n");
        boolean isEmpty = true;
        for (int i=0; i < list.length; i++){
            if (list[i] != null) {
                System.out.println(i + 1 + ". " + (list[i] == null ? "--" : list[i]));
                isEmpty = false;
            }
        }
        if (isEmpty){
            System.out.println("Guest list is empty.");
        }
    }
    static void DisplayMenu(){
        System.out.println("______________________________");
        System.out.println("- Menu -");
        System.out.println("\n1 - Add Guest");
        System.out.println("2 - Insert Guest");
        System.out.println("3 - Remove Guest");
        System.out.println("4 - Rename Guest");
        System.out.println("5 - Exit\n");
    }
    static int getOption(){
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
    static void addGuest(){
            for (int i=0; i < list.length; i++){
                if(list[i] == null) {
                    System.out.println("______________________________");
                    System.out.println("- Add guest -");
                    System.out.print("Name: ");
                    list[i] = scanner.nextLine();
                    break;
                }
            }
    }
    static void insertGuest(){
        System.out.print("Insert guest number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (num > 0 && num < 10) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            for (int i = list.length-1; i > num-1; i--)
            {
                list[i] = list[i-1];
            }
            list[num - 1] = name;
        }
        else {
            System.out.println("\nError: There is no guest with that number.");
        }
    }
    static void renameGuest(){
        System.out.print("Rename guest number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (num > 0 || num < 10 || list[num-1] != null) {
            System.out.print(list[num - 1] + " rename to: ");
            list[num - 1] = scanner.nextLine();
        }
        else {
            System.out.println("\nError: There is no guest with that number.");
        }

    }
    static void remGuest(){
            System.out.println("______________________________");
            System.out.println("- Delete guest -\n");
            System.out.print("Delete number: ");
            int num = scanner.nextInt();
            if (num > 0 || num < 10 || list[num-1] != null) {
                list[num - 1] = null;
            }
            else {
                System.out.println("\nError: There is no guest with that number.");
            }

            String temp[] = new String[list.length];
            int ti = 0;
            for (int i=0; i < list.length; i++){
                if(list[i] != null){
                    temp[ti] = list[i];
                    ti++;
                }
            }
            list = temp;
    }
    static void addTestNames(){
        list[0] = "John";
        list[1] = "Brain";
        list[2] = "Amanda";
        list[3] = "Natalie";
        list[4] = "Megan";
    }

}
