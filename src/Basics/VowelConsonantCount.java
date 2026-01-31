package Basics;
import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Convert to lowercase to make checking easy
            ch = Character.toLowerCase(ch);

            if (ch >= 'a' && ch <= 'z') {  // check if letter

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        sc.close();
    }
}
