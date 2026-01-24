package Basics;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second; // find next number
            first = second;            // shift second to first
            second = next;             // shift next to second
        }

        sc.close();
    }
}
