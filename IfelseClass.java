import java.util.Scanner;

public class IfelseClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 1 || (n >= 6 && n <= 20)) {
            System.out.println("Weird");

        } else if (n % 2 == 0 || (n <= 2 && n >= 5)) {
            System.out.println("Not weird");

        } else {
            System.out.println("Not Weird");
        }

    }

}
