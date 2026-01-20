package Basics;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();      // original number

        int reverse = 0;             // will store reversed number

        while (num != 0) {

            int digit = num % 10;    // step 1: get last digit
            reverse = reverse * 10 + digit; // step 2: add digit
            num = num / 10;          // step 3: remove last digit
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}
