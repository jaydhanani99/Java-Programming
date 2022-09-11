import java.util.Arrays;

public class _40ArrayClass {
    public static void main(String[] args) {
        int[] numbers  = {1, 2, 3, 4, 5, 6, 7};


        // Binary Search
        // Inbuilt method of binarySearch of Arrays class
        int index = Arrays.binarySearch(numbers, 7);


        // To sort array
        Arrays.sort(numbers);


        // Parallel sort (uses multi thread)
        Arrays.parallelSort(numbers);
    }
}
