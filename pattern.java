import java.util.Scanner;

import javax.sql.RowSet;
import javax.swing.RowFilter;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Input the number: ");
        // int n = sc.nextInt();

        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++) {
                if (col <= rows) {
                    // System.out.println("*");

                    System.out.print(col);
                }

            }
            System.out.println("");

        }
    }
}
