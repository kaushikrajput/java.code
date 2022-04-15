import java.security.Key;

public class binary {

    ///////////////////////// find number by linear search ///////////////////////

    // public static int linarSearh(int[] array, int key) {
    // for (int i = 0; i < array.length; i++) {
    // if (array[i] == key) {

    // return i;

    // }

    // }
    // return -1;

    // }

    // public static void main(String[] args) {
    // int[] arr = { 2, 3, 45, 6, 5, 4 };

    // int index = linarSearh(arr, 5);
    // System.out.println("index of 5 is " + index);

    // }
    // }

    //////////////////// find number by binary search ////////////////////////////

    // public static int binarySearch(int[] array, int key) {
    // int start = 0;
    // int end = array.length - 1;

    // int mid = (start + end) / 2;

    // while (start <= end) {
    // if (array[mid] == key) {
    // return mid;

    // }
    // if (key > array[mid]) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }

    // mid = (start + end) / 2;
    // }
    // return -1;

    // }

    // public static void main(String[] args) {
    // int[] even = { 2, 4, 6, 8, 12, 18 };

    // int[] odd = { 3, 8, 11, 16, 14 };

    // int evenIndex = binarySearch(even, 18);

    // System.out.println("index of 18 is " + evenIndex);

    // int oddIndex = binarySearch(odd, 11);
    // System.out.println("index of 11 is " + oddIndex);
    // }

    // }

    public static void binarySearch() {

    }

    public static int modifiedbinarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[start] < array[mid]) {
                if (key >= array[start] && key < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (key > array[mid] && key <= array[end]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;

                }

            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 30, 40, 50, 60, 5, 10 };

        System.out.println(" index of 20 is at " + modifiedbinarySearch(arr, 20));
    }
}