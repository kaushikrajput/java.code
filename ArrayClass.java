import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class ArrayClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // {

        // int[] arr = { 1, 2, 3, 4 };
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);

        // }

        ///////////////////////////// length of array ////////////////////////

        // for (int i = 0; i < num.length; i++) {
        // System.out.println(num[i]);
        // }

        //////////////////////////// reverse the array ///////////////////////

        // for (int i = num.length - 1; i >= 0; i--) {
        // System.out.println(num[i]);
        // }

        // for (int i = 0; i < n; i++) {
        // System.out.println(int);
        // }

        /////////////////////////// take user input & print ////////////////////////

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the no. of elements you want to store: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of array: ");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();

        // }

        // System.out.println("array elements are: ");
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);
        // }

        // }

        // }

        // System.out.println("Enter no. of element you want to store: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // int sum = 0;
        // System.out.println("Enter the elements of array: ");

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // sum = sum + arr[i];

        // }
        // System.out.println("sum is " + sum);
        // double average = sum / arr.length;
        // System.out.println("average is " + average);

        // int[][] matrix = { { 1, 2, 3 },
        // { 4, 5, 6 } };
        // System.out.println(matrix[1][2]);

        // int[] my_array = { 23, 43, 12, 21, 22, 25, 65, 32, 14, 54 };
        // int[] new_array = new int[10];

        // System.out.println("Source array: " + Arrays.toString(my_array));
        // for (int i = 0; i < my_array.length; i++) {

        // new_array[i] = my_array[i];
        // }
        // // for (int i = 0; i < my_array.length; i++) {
        // // System.out.print(" " + my_array[i]);
        // // }
        // // System.out.println();
        // System.out.println("New_array: " + Arrays.toString(new_array));
        // // for (int i = 0; i < my_array.length; i++) {
        // // System.out.print(" " + new_array[i]);

        // // }}}

        //////////////////////// max. and min. value ////////////////////////

        // int[] array = { 2, 3, 5, 7, 1, 4 };

        // int max = array[0];
        // int min = array[0];
        // for (int i = 1; i < array.length; i++) {

        // if (array[i] > max) {
        // max = array[i];

        // }
        // if (array[i] < min) {
        // min = array[i];

        // }
        // }
        // System.out.println("Max. value is: " + max);
        // System.out.println("Min. value is: " + min);

        ///////////////////////// multiply of two matrices /////////////////////////////

        // int n = 3;
        // int[][] row = { { 5, 2, 3 }, { 2, 6, 3 }, { 6, 9, 1 } };
        // int[][] col = { { 2, 7, 5 }, { 1, 4, 3 }, { 1, 2, 1 } };

        // int[][] mul = new int[n][n];
        // System.out.println("Input first matrix: ");

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(row[i][j] + " ");

        // }
        // System.out.println();
        // }
        // System.out.println("Input second matrix: ");

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(col[i][j] + " ");

        // }
        // System.out.println();
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // for (int k = 0; k < n; k++) {

        // mul[i][j] = mul[i][j] + row[i][k] * col[k][j];
        // }
        // }
        // }
        // System.out.println("Multiplication of two matrix: ");
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {

        // System.out.print(mul[i][j] + " ");
        // }

        // System.out.println();
        // }

        /////////////// n number of multipication of matrix/////////////////////

        // int a[][] = new int[3][3];
        // int b[][] = new int[3][3];

        // // creating another matrix to store the multiplication of two matrices
        // int c[][] = new int[3][3]; // 3 rows and 3 columns

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print("Input first matrix: ");
        // a[i][j] = sc.nextInt();
        // }

        // }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {

        // System.out.print(a[i][j] + " ");
        // }
        // System.out.println();
        // }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print("Input second matrix: ");
        // b[i][j] = sc.nextInt();
        // }

        // }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {

        // System.out.print(b[i][j] + " ");
        // }
        // System.out.println();
        // }

        // // multiplying and printing multiplication of 2 matrices
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // c[i][j] = 0;

        // for (int k = 0; k < 3; k++) {
        // c[i][j] += a[i][k] * b[k][j];
        // } // end of k loop
        // System.out.print(c[i][j] + " "); // printing matrix element
        // } // end of j loop
        // System.out.println();// new line
        // }

        // int a[] = { 23, 43, 2, 10 };

        // for (int i = 0; i < a.length - 1; i++) {
        // for (int j = 0; j < a.length - i - 1; j++) {
        // if (a[j] > a[j + 1]) {
        // int temp = a[j];
        // a[j] = a[j + 1];
        // a[j + 1] = temp;
        // }
        // }
        // }
        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i] + " ");
        // }
        // System.out.println();

        // int n = sc.nextInt();
        int[] my_array = { 2, 34, 76, 45, 23 };
        int[] new_array = new int[5];

        System.out.println("Original array: ");
        for (int i = 0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }
        // for (int i = 0; i < my_array.length; i++) {
        System.out.print("Copy array is: ");
        for (int i = 0; i < new_array.length; i++) {

            System.out.print(" " + new_array[i]);
        }

    }
}
