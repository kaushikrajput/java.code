import java.rmi.server.RMISocketFactory;
import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.PagesPerMinute;

public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 0 for Rock
        // 1 for Paper
        // 2 for scissor

        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for scissor: ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");

        } else if (userInput == 0 && computerInput == 2 || userInput == 2 && computerInput == 1
                || userInput == 1 && computerInput == 0) {
            System.out.println("You Win!");

        } else {
            System.out.println("Computer Win!");
        }

        if (computerInput == 0) {
            System.out.println("Computer choice: Rock");

        } else if (computerInput == 1) {
            System.out.println("Computer choice: paper");

        } else if (computerInput == 2) {
            System.out.println("Compter choice: scissor");

        }

    }

}
