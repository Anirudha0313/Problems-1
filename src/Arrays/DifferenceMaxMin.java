package Arrays;
import java.util.Scanner;

public class DifferenceMaxMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int difference = largest - smallest;

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
        System.out.println("Difference = " + difference);

        sc.close();
    }
}
