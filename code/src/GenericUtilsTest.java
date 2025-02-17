/*
 * GenericUtilsTest.java
 * @author Stefan Crasnianec
 * @version 1.0
 */
public class GenericUtilsTest {

    /**
     * Utility method to print array elements on a single line.
     *
     * @param array The array whose elements are to be printed.
     * @param <T>   The type of the array elements.
     */
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Move to the next line after printing the array.
    }

    public static void main(String[] args) {
        // Test the reverse method with an array of Strings.
        String[] words = {"one", "two", "three", "four", "five"};
        System.out.println("Original string array:");
        printArray(words);
        GenericUtils.reverse(words);
        System.out.println("Reversed string array:");
        printArray(words);

        // Test the reverse method with an array of Integers.
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("\nOriginal integer array:");
        printArray(numbers);
        GenericUtils.reverse(numbers);
        System.out.println("Reversed integer array:");
        printArray(numbers);

        // Test the sum method with an array of Integers.
        Integer[] intArray = {1, 2, 3, 4, 5};
        double sumIntegers = GenericUtils.sum(intArray);
        System.out.println("\nSum of integers: " + sumIntegers);

        // Test the sum method with an array of Doubles.
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5};
        double sumDoubles = GenericUtils.sum(doubleArray);
        System.out.println("Sum of doubles: " + sumDoubles);
    }
}
