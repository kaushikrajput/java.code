import java.util.Scanner;

public class selection {

    public static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[20] arr,n,temp;

       
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            int n = new arr[i];
        }
    
         System.out.println("After sorting array: "+selectionSort(arr, n));
         for (int i = 0; i < n; i++) {
             System.out.println(arr[i])
         }


    }
}
