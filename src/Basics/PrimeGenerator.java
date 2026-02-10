package Basics;
import java.util.Scanner;

public class PrimeGenerator {

    // Method to check if number is prime
    static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many prime numbers to print? ");
        int n = sc.nextInt();

        int count = 0;
        int number = 2;

        while (count < n) {

            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }

        sc.close();
    }
}
