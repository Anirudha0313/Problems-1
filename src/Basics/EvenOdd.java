package Basics;
import java.util.Scanner;

public class EvenOdd {


        public static void main(String[] args) { // Step 1: main method starts

            Scanner sc = new Scanner(System.in); // Step 2: Create Scanner object

            System.out.print("Enter a number: "); // Step 3: Ask user for input
            int num = sc.nextInt();               // Step 4: Read integer input

            if (num % 2 == 0) {                   // Step 5: Check even condition
                System.out.println("Even Number");
            } else {                              // Step 6: Else block
                System.out.println("Odd Number");
            }

            sc.close(); // Step 7: Close Scanner
        }
    }


