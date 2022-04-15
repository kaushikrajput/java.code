import java.rmi.NoSuchObjectException;
import java.util.Scanner;

import javax.xml.transform.Source;

public class basicClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Input 1st number: ");
        // int n1 = sc.nextInt();
        // System.out.println("Input 2nd number: ");
        // int n2 = sc.nextInt();
        // System.out.println("Input 3rd number: ");
        // int n3 = sc.nextInt();
        // System.out.println("Input 14th number: ");
        // int n4 = sc.nextInt();

        // if (n1 == n2 && n2 == n3 && n3 == n4) {
        // System.out.println("all four are equals");
        // } else {
        // System.out.println("not equal");
        // }

        //////////////////// test if no. btw two numbers /////////////////////

        // System.out.println("Input 1st number: ");
        // double n1 = sc.nextDouble();
        // System.out.println("Input 2nd number: ");
        // double n2 = sc.nextDouble();

        // if (n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1) {
        // System.out.println("btw 0 and 1");

        // } else {
        // System.out.println("False");

        // }

        ///////////////////////// four no. equal or not //////////////////////

        // System.out.println("Input first integer: ");
        // int n1 = sc.nextInt();
        // System.out.println("Input second integer: ");
        // int n2 = sc.nextInt();
        // System.out.println("Input third integer: ");
        // int n3 = sc.nextInt();
        // System.out.println("Input fourth integer: ");
        // int n4 = sc.nextInt();

        // if (n1 == n2 && n2 == n3 && n3 == n4) {
        // System.out.println("Numbers are equal");
        // } else {
        // System.out.println("Numbers are not equal");
        // }

        System.out.println("Input first no.:");
        double n1 = sc.nextDouble();
        System.out.println("Input second no.:");
        double n2 = sc.nextDouble();

        if (n1 > 0 && n1 < 1 || n2 > 0 && n2 < 1) {
            System.out.println("between 0 and 1 ");

        } else {
            System.out.println("false");
        }
    }

}
