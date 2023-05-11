/**
 * @author Iurii Golubnichenko
 * <p>
 * Given an unsorted array of integers, we need to sort that array using selection sort algorithm.
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

public class SelectionSorting {
    /**
     * Time complexity O(n^2) and Space complexity O(1)
     * @param arrayOfIntegers given unsorted array of integers
     * @return sorted array
     */
    public static int[] selectionSort(int[] arrayOfIntegers) {
        if (arrayOfIntegers.length == 0) {
            return new int[0];
        }
        int startIndex = 0;
        while (startIndex < arrayOfIntegers.length - 1) {
            int smallestNumberIndex = startIndex;
            for (int i = startIndex + 1; i < arrayOfIntegers.length; i++) {
                if (arrayOfIntegers[smallestNumberIndex] > arrayOfIntegers[i]) {
                    smallestNumberIndex = i;
                }
            }
            swapValuesInArray(startIndex, smallestNumberIndex, arrayOfIntegers);
            startIndex++;
        }
        return arrayOfIntegers;
    }

    private static void swapValuesInArray(int firstIndex, int secondIndex, int[] arrayOfIntegers) {
        int temporaryValue = arrayOfIntegers[secondIndex];
        arrayOfIntegers[secondIndex] = arrayOfIntegers[firstIndex];
        arrayOfIntegers[firstIndex] = temporaryValue;
    }
}
