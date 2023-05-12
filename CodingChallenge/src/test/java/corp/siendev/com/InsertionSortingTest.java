/**
 * @author Iurii Golubnichenko
 *
 * Test cases for Insertion sorting challenge.
 */
package corp.siendev.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSortingTest {
    private static final int[] firstUnsortedArray = new int[] { 3, 8, 0, 45, 7, 3, 1, 9, 88, 5 };
    private static final int[] firstSortedArray = new int[] { 0, 1, 3, 3, 5, 7, 8, 9, 45, 88 };
    private static final int[] secondUnsortedArray = new int[] { 2, 8, 1, 3, 6, 7, 5, 4 };
    private static final int[] secondSortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

    @Test
    public void insertionSortTest() {
        int[] result = InsertionSorting.insertionSort(firstUnsortedArray);
        Assertions.assertArrayEquals(firstSortedArray, result);

        int[] anotherResult = InsertionSorting.insertionSort(secondUnsortedArray);
        Assertions.assertArrayEquals(secondSortedArray, anotherResult);
    }
}
