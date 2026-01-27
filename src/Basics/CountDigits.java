package Basics;
import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {
            num = num / 10;  // remove last digit
            count++;         // increase digit count
        }

        System.out.println("Total digits = " + count);

        sc.close();
    }
}
