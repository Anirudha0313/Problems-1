package Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = { {1, 2}, {3, 4} };
        int[][] b = { {5, 6}, {7, 8} };

        int rows = a.length;
        int cols = a.length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print result
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}   
