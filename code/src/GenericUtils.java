/*
 * GenericUtils.java
 * @author Stefan Crasnianec
 * @version 1.0
 */
public class GenericUtils {

    /**
     * Reverses the given array in place.
     * The first element will be swapped with the last, the second with the second last, and so on.
     *
     * @param array The array to be reversed.
     * @param <T>   The type of the array elements.
     */
    public static <T> void reverse(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap the elements at
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Calculates the sum of all elements in the array.
     * The array must contain elements that are subclasses of Number.
     *
     * @param array The array containing Number elements.
     * @param <T>   The type of the array elements, which must extend Number.
     * @return The sum of the array elements as a double.
     */
    public static <T extends Number> double sum(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }
        double total = 0.0;
        for (T number : array) {
            // Check for null elements to avoid NullPointerException
            if (number != null) {
                total += number.doubleValue();
            }
        }
        return total;
    }
}
