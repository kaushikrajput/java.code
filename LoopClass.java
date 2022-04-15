
import java.util.Scanner;

public class LoopClass {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter an integer ");
        // int n = sc.nextInt();

        // int count = 0;
        // if (n > 1) {

        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0)
        // count++;
        // sc.close();
        // }

        // if (count == 2) {
        // System.out.println("prime");
        // } else {
        // System.out.println("non prime");
        // }
        // }

        // else {
        // System.out.println("non prime");
        // }

        ////////////////////////// pattern program ////////////////////////////

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter an integer ");
        // int n = sc.nextInt();
        // int i, j;

        // for (i = 1; i <= n; i++) {

        // for (j = 1; j <= 2 * n - 1; j++) {
        // if (j <= n + 1 - i || j >= n - 1 + i) {
        // System.out.print("*");

        // } else {
        // System.out.print(" ");
        // sc.close();
        // }

        // }
        // System.out.println();

        ////////////////////////////////// prime or not ///////////////////////////////

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Input an integer ");
        // int n = sc.nextInt();
        // int i;

        // for (i = 2; i < n; i++) {
        // if (n % i == 0) {
        // System.out.println("non prime ");
        // return;
        // }

        // }
        // if (i == n) {
        // System.out.println("Prime");

        // }

        ///////////////////////////// n table////////////////////////////

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for (int i = 1; i <= 10; i++) {

        // System.out.println(n + "x" + i + "=" + n * i);
        // }
        // {

        // System.out.println();
        // }

        ////////////////////////// natural number reverse /////////////////////

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev;

        // for (int i = n; i >= 1; i--) {

        // System.out.println(i);
        // }

        while (n > 0) {
            rev = n % 10;
            System.out.println(+rev);
            n = n / 10;

        }
        // System.out.println(" ");

        ////////////////// n no. of prime numbers ////////////////////////

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.println(2 * i - 1);
        // }

    }

}
