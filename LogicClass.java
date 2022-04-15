import java.util.Scanner;

public class LogicClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int a = sc.nextInt();
        int b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping a is " + a);
        System.out.println("After swapping b is " + b);

    }

}
