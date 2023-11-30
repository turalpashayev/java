import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        int start = ThreadLocalRandom.current().nextInt(1,101);
        char[] pos = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
        Scanner scn = new Scanner(System.in);
        int input;
        char turn = 'X';
        int counter = 0;
        boolean isFirstPlayer = true;
        System.out.print("First player name: ");
        String player1 = scn.next();
        System.out.print("Second player name: ");
        String player2 = scn.next();
        if (start <= 50 ){
            System.out.print("\n");
            System.out.println(player1 + " will start first");
        }
        else if (start > 50 ) {
            isFirstPlayer = false;
            turn = 'O';
            System.out.print("\n");
            System.out.println(player2 + " will start first");
        }

        System.out.println("\n 7 | " + "8" + " | " + "9" + " ");
        System.out.println("---+---+---");
        System.out.println(" 4 | " + "5" + " | " + "6" + " ");
        System.out.println("---+---+---");
        System.out.println(" 1 | " + "2" + " | " + "3" + " \n");


        while (true) {
            do {
                System.out.print("Enter a position: ");
                input = scn.nextInt();
            }
            while (input < 1 || input > 9 || pos[input-1] == 'X' || pos[input-1] == 'O');
            pos[input - 1] = turn;

            System.out.println("\n " + pos[6] + " | " + pos[7] + " | " + pos[8] + " " + "    7 | " + "8" + " | " + "9" + " ");
            System.out.println("---+---+---" + "   ---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " " + "    4 | " + "5" + " | " + "6" + " ");
            System.out.println("---+---+---" + "   ---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " " + "    1 | " + "2" + " | " + "3" + " \n");

            if (
                    pos[0]==turn && pos[1]==turn && pos[2]==turn
                    || pos[3]==turn && pos[4]==turn && pos[5]==turn
                    || pos[6]==turn && pos[7]==turn && pos[8]==turn
                    || pos[0]==turn && pos[3]==turn && pos[6]==turn
                    || pos[1]==turn && pos[4]==turn && pos[7]==turn
                    || pos[2]==turn && pos[5]==turn && pos[8]==turn
                    || pos[0]==turn && pos[4]==turn && pos[8]==turn
                    || pos[2]==turn && pos[4]==turn && pos[6]==turn
            )
                { if (turn == 'X')
                {
                    System.out.println("Winner is " + player1);
                }
                else
                {
                    System.out.println("Winner is " + player2);
                }
                    break;
                }

            if (turn == 'X'){
                turn = 'O';
            }
            else if (turn == 'O'){
                turn = 'X';

            }
            counter++;
            if (counter >= 9 )
            {
                System.out.println("Game is DRAW");
                break;
            }
        }
    }
}

//
