/**
 * @author Iurii Golubnichenko
 * <p>
 * Given an unsorted array of integers, we need to sort that array using insertion sort algorithm.
 * As a result we must output a sorted array.
 * </p>
 * Example
 * ======================================================================================================
 * Input: givenArray = [3, 8, 0, 45, 7, 3, 1, 9, 88, 5];
 * Output: [0, 1, 3, 3, 5, 7, 8, 9, 45, 88]
 * ======================================================================================================
 *
 */
package corp.siendev.com;

public class InsertionSorting {
    /**
     * Time complexity O(n^2) and Space complexity O(1)
     * @param arrayOfInteger given unsorted array of integers
     * @return sorted array
     */
    public static int[] insertionSort(int[] arrayOfInteger) {
        if (arrayOfInteger.length == 0) {
            return new int[0];
        }
        for (int i = 1; i < arrayOfInteger.length; i++) {
            int j = i;
            while (j > 0 && arrayOfInteger[j] < arrayOfInteger[j - 1]) {
                swapValuesInArray(j, j - 1, arrayOfInteger);
                j--;
            }
        }
        return arrayOfInteger;
    }

    private static void swapValuesInArray(int firstIndex, int secondIndex, int[] arrayOfIntegers) {
        int temporaryValue = arrayOfIntegers[secondIndex];
        arrayOfIntegers[secondIndex] = arrayOfIntegers[firstIndex];
        arrayOfIntegers[firstIndex] = temporaryValue;
    }
}
