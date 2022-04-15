import java.util.Scanner;

import javax.print.attribute.DateTimeSyntax;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class MethodClass {

    //////////////////////////// print name ////////////////////////

    // public static void myName(String name) {
    // System.out.println(name);
    // return;

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    // myName(name);

    // }

    ////////////////////////// cal. product ///////////////////////////

    // public static int calculateProduct(int a, int b) {
    // int product = a * b;
    // return product;

    // }

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // int product = calculateProduct(a, b);
    // System.out.println(product);

    // }

    ////////////////////////////// even or odd///////////////////////////

    // public static void evenOrOdd(int num) {
    // if (num % 2 == 0) {
    // System.out.println("Even");
    // } else {
    // System.out.println("Odd");

    // }
    // return;

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();

    // evenOrOdd(num);

    // }

    ///////////////////////// sum of n no. of array /////////////////////////

    // public static int displayArray(int arr[], int n) {
    // int sum = 0;

    // for (int i = 0; i < n; i++) {
    // sum = sum + arr[i];

    // }
    // return sum;

    // }

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the no. of element in the array: ");
    // int n = sc.nextInt(); //declare nd Initialize the array size
    // int[] arr = new int[n]; // declare array

    // System.out.println("Enter the element of array: ");
    // for (int i = 0; i < n; i++) // Initialize the array
    // {
    // arr[i] = sc.nextInt();
    // }

    // System.out.println("Sum of array element: " + displayArray(arr, n));

    // }

    //////////////////////// palindrome no. /////////////////////////////

    // public static boolean palindromeOrNot(int num) {

    // int sum = 0, rev;
    // while (num != 0) {
    // rev = num % 10;
    // sum = (sum * 10) + rev;
    // num = num / 10;
    // }

    // }

    // public static void main(String[] args) {

    // int n;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter any number ");
    // n = sc.nextInt();

    // if (palindromeOrNot(n))
    // System.out.println("this is a palindrome number");
    // else
    // System.out.println("this is not a palindrome number ");
    // }

    /////////////////////// print n prime no. ////////////////////////

    // public static boolean isPrime(int n) {
    // int i;
    // for (i = 2; i < n; i++) {
    // if (n % i == 0) {
    // break;

    // }
    // }
    // if (i == n) {

    // }
    // return n == i;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n1, n2;

    // System.out.println("Enter first no.: ");
    // n1 = sc.nextInt();
    // System.out.println("Enter second no.: ");
    // n2 = sc.nextInt();
    // System.out.println("The prime numbers are: ");

    // for (int i = n1; i <= n2; i++) {
    // if (isPrime(i))
    // System.out.println(i);

    ///////////////////////////// switch case ///////////////////////////

    // public static void switchCase(int days) {
    // switch (days) {
    // case 1:
    // System.out.println("Sunday");

    // break;
    // case 2:
    // System.out.println("Monday");
    // break;
    // case 3:
    // System.out.println("Tueday");
    // break;
    // case 4:
    // System.out.println("Wednesday");
    // break;
    // case 5:
    // System.out.println("Thursday");
    // break;
    // case 6:
    // System.out.println("Friday");
    // break;
    // case 7:
    // System.out.println("Saturday");
    // break;

    // default:
    // System.out.println("You are entered wrong Number!");
    // break;
    // }

    // }

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number: ");
    // int num = sc.nextInt();
    // switchCase(num);
    // }

    public static int smallestNumber(int n1, int n2, int n3) {

        if (n1 < n2 && n1 < n3) {
            System.out.println("smallest number: " + n1);

        } else if (n2 < n1 && n2 < n3) {
            System.out.println("smallest number: " + n2);

        } else

        {
            System.out.println("smallest number: " + n3);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int n1 = sc.nextInt();
        System.out.println("Input second number: ");
        int n2 = sc.nextInt();
        System.out.println("Input third number: ");
        int n3 = sc.nextInt();

        System.out.println(smallestNumber(n1, n2, n3));
    }
}