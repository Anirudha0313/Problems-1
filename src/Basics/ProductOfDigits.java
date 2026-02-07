package Basics;
import java.util.Scanner;

public class ProductOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;

        while (num != 0) {

            int digit = num % 10;   // get last digit
            product = product * digit;  // multiply
            num = num / 10;  // remove last digit
        }

        System.out.println("Product of digits = " + product);

        sc.close();
    }
}
