import java.util.Calendar;
import java.util.Scanner;

public class StringsClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String fName = "Tony";
        // String lName = "stark";
        // String concatenation = fName.concat(lName);
        // System.out.println(" concatenation of string: " + concatenation);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a name: ");
        // String name = sc.nextLine();
        // System.out.println(name);

        ////// concatenation...!

        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName.length());

        /////////////////////// index of any string ///////////////////////////////////

        // String greet = "Hello world";

        // System.out.println("Index " + greet.indexOf("w"));

        ////////////////////////// compare two string//////////////////////////////////

        // String name1 = "Tony";
        // String name2 = "tony";

        // if (name1.compareTo(name2) == 0) {
        // System.out.println("Strings are equal");

        // } else{
        // System.out.println("Strings are not equal");

        // }
        // System.out.println(name1.equalsIgnoreCase(name2));

        // if (name1 == name2) {
        // System.out.println("true");

        // } else {
        // System.out.println("false");
        // }

        /////////////////////// reversed string //////////////////////////

        // System.out.println("Enter the string to reverse: ");
        // String n = sc.nextLine();
        // String rev = "";
        // int length = n.length();
        // for (int i = length - 1; i >= 0; i--) {
        // rev = rev + n.charAt(i);
        // }
        // System.out.println("Reversed String - " + rev);

        ///////////////////// get index character ////////////////////////

        // String name = "Java Exercise!";

        // System.out.println("The character at position 0 is" + name.charAt(0));
        // System.out.println("The character at position 10 is" + name.charAt(10));

        // String str1 = "This is Exercise1";
        // String str2 = "This is Exercise2";

        ///////////////////////// compare two string /////////////////////////

        // System.out.println("Input 1st string: ");
        // String str1 = sc.nextLine();
        // System.out.println("Input 2nd string: ");
        // String str2 = sc.nextLine();

        // int result = str1.compareTo(str2);

        // if (result < 0) {
        // System.out.println(str1 + " is less than " + str2);

        // } else if (result == 0) {
        // System.out.println(str1 + " is equal to " + str2);

        // } else {
        // System.out.println(str1 + " is greater than " + str2);
        // }

        //////////////////////// check string endswith //////////////////////

        // String str1 = "pythonExercise";
        // String str2 = "pythonExercises";

        // String end_str = "se";

        // boolean ends1 = str1.endsWith(end_str);
        // boolean ends2 = str2.endsWith(end_str);

        // System.out.println(" " + str1 + " ends with " + end_str + "? " + ends1);
        // System.out.println(" " + str2 + " ends with " + end_str + "? " + ends2);

        // Calendar c = Calendar.getInstance();
        // System.out.println("Current Date and Time :");
        // System.out.format("%tB %te, %tY%n", c, c, c);
        // System.out.format("%tl:%tM %tp%n", c, c, c);

        String sentence = sc.nextLine();
        String word = "";
        String longestWord = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word = word + ch;

            } else if (word.length() > longestWord.length()) {
                longestWord = word;

                word = "";
            }

        }

        System.out.println("Longest word is: " + longestWord);

    }
}
