/**
 * @author Iurii Golubnichenko
 *
 * Test cases for Three Largest Numbers challenge.
 */
package corp.siendev.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeLargestNumbersTest {
    private static final int[] arrayOfNumbers = new int[] { 10, 202, 0, -34, 5, -9, 6, 25 };
    private static final int[] expectedResult = new int[] { 10, 25, 202 };

    @Test
    public void findThreeLargestNumbersWithSortingTest() {
        int[] result = ThreeLargestNumbers.findThreeLargestNumbersWithSorting(arrayOfNumbers);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void findThreeLargestNumbersTest() {
        int [] result = ThreeLargestNumbers.findThreeLargestNumbers(arrayOfNumbers);
        Assertions.assertArrayEquals(expectedResult, result);
    }
}
