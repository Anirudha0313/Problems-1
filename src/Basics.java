import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
      /*  Scanner input = new Scanner(System.in);
        int a =  input.nextInt();
        int b =  input.nextInt();
        int c = a * b ;
        int d = a+b;
        System.out.println("Multiplication= " + c);
        System.out.println("Addition= " + d); 
        
       */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            int i;
            for (i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    System.out.println("Not Prime");
                    break;
                }
            }

            if (i * i > n) {
                System.out.println("Prime");
            }
        }

    }
}
