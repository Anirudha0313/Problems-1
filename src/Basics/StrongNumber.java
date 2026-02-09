package Basics;
import java.util.Scanner;
public class StrongNumber {

    // Method to calculate factorial
    static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Method to check if number is Strong
    static boolean isStrong(int num) {

        int original = num;
        int sum = 0;

        while (num != 0) {

            int digit = num % 10;

            sum = sum + factorial(digit);  // calling factorial method

            num = num / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isStrong(number))
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");

        sc.close();
    }
}
