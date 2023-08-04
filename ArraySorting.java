import java.util.Arrays;
// used to import the Arrays class, provides various
// static methods for working with arrays in Java.
public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        // initializes the array of numbers
        Arrays.sort(numbers);
        // utilizes the sort method to sort the array
        System.out.print("Sorted Array: ");
        for (int number : numbers) {
            // For each element, it prints the element followed by a space,
            // shows the sorted array separated by spaces.
            System.out.print(number + " ");
        }
    }
}

