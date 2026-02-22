package StarPattern;
import java.util.Scanner;

public class HollowPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars or spaces
            for (int j = 1; j <= 2 * i - 1; j++) {

                if (i == 1 || i == n || j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();
    }
}