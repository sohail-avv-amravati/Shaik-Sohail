//implement a java program using the below array methods sort,arrayto string fill and copy
import java.util.Arrays;
class ArrayMethods {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 3, 8, 1, 2};

        // Sort the array
        Arrays.sort(numbers);
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Fill the array with a specific value
        Arrays.fill(numbers, 0);
        System.out.println("Array after fill: " + Arrays.toString(numbers));

        // Copy the array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}