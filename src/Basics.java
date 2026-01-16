import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =  input.nextInt();
        int b =  input.nextInt();
        int c = a * b ;
        int d = a+b;
        System.out.println("Multiplication= " + c);
        System.out.println("Addition= " + d);


    }
}
