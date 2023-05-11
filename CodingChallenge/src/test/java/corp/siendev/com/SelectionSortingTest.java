/**
 * @author Iurii Golubnichenko
 *
 * Test cases for Selection sorting challenge.
 */
package corp.siendev.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortingTest {
    private static final int[] firstUnsortedArray = new int[] { 3, 8, 0, 45, 7, 3, 1, 9, 88, 5 };
    private static final int[] firstSortedArray = new int[] { 0, 1, 3, 3, 5, 7, 8, 9, 45, 88 };
    private static final int[] secondUnsortedArray = new int[] { 2, 8, 1, 3, 6, 7, 5, 4 };
    private static final int[] secondSortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

    @Test
    public void selectionSortFirstTest() {
        int[] result = SelectionSorting.selectionSort(firstUnsortedArray);
        Assertions.assertArrayEquals(firstSortedArray, result);
    }

    @Test
    public void selectionSortSecondTest() {
        int[] result = SelectionSorting.selectionSort(secondUnsortedArray);
        Assertions.assertArrayEquals(secondSortedArray, result);
    }
}
