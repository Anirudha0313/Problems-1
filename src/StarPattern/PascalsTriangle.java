package StarPattern;
import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int value = 1;

            // Print spaces (optional for formatting)
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(value + " ");

                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}