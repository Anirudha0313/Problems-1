package Arrays;
import java.util.Arrays;

public class ArrayCompare {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {3, 2, 1};

        System.out.println("arr1 equals arr2: " + Arrays.equals(arr1, arr2)); // true
        System.out.println("arr1 equals arr3: " + Arrays.equals(arr1, arr3)); // false
    }
}
