import java.util.Arrays;
import java.util.Comparator;

public class _8Array {
    public static void main(String[] args) {

        // Integer array
        int[] numbers = new int[10];

        // The default value of array elements is 0, we can change values using Arrays.fill();
        Arrays.fill(numbers, 1);

        // Copy range of array, below will copy array from index 3 to 6
        int[] numCopy = Arrays.copyOfRange(numbers, 2, 5);

        // Initialize with pre-defined values
        int[] nums = {1, 2, 5, 10};

        System.out.println(nums[3]);


        // Multidimensional Arrays
        int[][] multi = new int[5][5];

        int[][] mult = {{1, 3, 5}, {2, 4, 6}};

        // Compare two dimensional array deeply
        boolean equals = Arrays.deepEquals(multi, mult);

        // deepHashCode: method would return the hash code depending upon “deep contents” of the mentioned arrays.
        int hash = Arrays.deepHashCode(multi);

        // Comparable and Comparator in java
        // https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
    }
}
