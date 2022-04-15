import java.rmi.server.RemoteRef;
import java.text.BreakIterator;
import java.util.Scanner;

public class MathsClass {

    /////////////////// fahrenhiet to celcius /////////////////////

    // public static double fahrenheittocelcius(Double fahrenheit) {

    // double celcius = ((5 * (fahrenheit - 32.0)) / 9);

    // return celcius;
    // }

    //////////////////// celcius to fahrenhiet ////////////////////

    // public static double celciustofahrenheit(double celcius) {
    // double fahrenheit = ((celcius * 1.8) - 32);
    // return fahrenheit;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // double base;
        // double height;
        // double area;
        // System.out.println("Input base of trian");
        // base = sc.nextInt();
        // System.out.println("Input height of trian");
        // height = sc.nextInt();

        // area = 0.5 * base * height;
        // System.out.println("area of trian" + area);

        // System.out.println("Input first number-");
        // double n1 = sc.nextInt();
        // System.out.println("Input first number-");
        // double n2 = sc.nextInt();
        // System.out.println("Input first number-");
        // double n3 = sc.nextInt();
        // System.out.println("Input first number-");
        // double n4 = sc.nextInt();
        // System.out.println("Input first number-");
        // double n5 = sc.nextInt();

        // double Average = (n1 + n2 + n3 + n4 + n5) / 5;
        // System.out.println("Average of numbers- " + Average);

        //////////////////////////// sum of digits /////////////////////////////

        // int sum = 0, rem;

        // System.out.println("Input an integer: ");
        // int n = sc.nextInt();

        // while (n != 0) {
        // rem = n % 10;
        // sum = sum + rem;
        // n = n / 10;

        // }
        // System.out.println("Sum of digits: " + sum);

        //////////////////////////////// total digits ////////////////////////////////

        // System.out.println("Input integer: ");
        // int n = sc.nextInt();
        // int count = 0;

        // while (n != 0) {
        // n = n / 10;
        // count++;

        // }
        // System.out.println("Total digits: " + count);

        ///////////////////////////// Find ASCII value /////////////////////////////

        // int chr = 'A';
        // System.out.println("The ASCII value of Z: " + chr);

        /////////////////////// prime or not ///////////////////////

        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int i;

        // for (i = 2; i < n; i++) {
        // if (n % i == 0) {
        // System.out.println("Non-prime");
        // break;

        // }
        // }
        // if (i == n) {
        // System.out.println("Prime");

        // }
        //////////////////////// method of calculate degree ////////////////////////

        // System.out.println("INput a degree in celcius: ");
        // double n = sc.nextInt();

        // System.out.println(celciustofahrenheit(n));

        ///////////////////////// fcatorial //////////////////////////////

        // System.out.print("Input a integer: ");
        // int num = sc.nextInt();
        // int fact = 1;

        // while (num >= 1) {
        // fact = fact * num;
        // num--;

        // }
        // System.out.println("Factorila is: " + fact);c

        //////////////////////////// inch to meter ////////////////////////////

        // System.out.print("Input inch: ");
        // double inch = sc.nextDouble();

        // double meter = inch * 0.0254;
        // System.out.println(inch + " inch is " + meter + " meter");

        //////////////////// sum of two no. btw two numberd /////////////////////////

        // System.out.println("Input an integer btw 0 to 1000: ");
        // int num = sc.nextInt();
        // int sum = 0;

        // int fD = num % 10;
        // int rN = num / 10;
        // int sD = rN % 10;
        // rN = rN / 10;
        // int tD = rN % 10;
        // rN = rN / 10;
        // int fourthD = rN % 10;
        // rN = rN / 10;

        // sum = fD + sD + tD + fourthD;
        // System.out.println("sum is: " + sum);

        /////////////////////// BMI calculater ///////////////////////////////

        // System.out.println("Input weight in pound: ");
        // double weight = sc.nextInt();
        // System.out.println("Input height in inch: ");
        // double inches = sc.nextInt();

        // double BMI = weight * 0.46 / (inches * 0.0254 * inches * 0.0254);
        // System.out.println("Your BMI is: " + BMI);

    }

}
