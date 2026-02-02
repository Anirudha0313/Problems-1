package Arrays;
import java.util.Scanner;

public class LargestInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];  // assume first is largest

        for (int i = 1; i < n; i++) {

            if (arr[i] > largest) {
                largest = arr[i];  // update largest
            }
        }

        System.out.println("Largest number = " + largest);

        sc.close();
    }
}
