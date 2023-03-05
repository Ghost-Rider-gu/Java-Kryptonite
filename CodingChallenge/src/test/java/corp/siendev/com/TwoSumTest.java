/**
 * @author Iurii Golubnichenko
 *
 * Test cases for TwoSum challenge.
 */
package corp.siendev.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    private static final int[] numsExample = new int[] { 3, 7, 15, 5, 4 };
    private static final int[] expectedResult = new int[] { 5, 4 };
    private static final int targetSum = 9;

    @Test
    public void sumOfTwoNumbersTest() {
        int[] result = TwoSum.sumOfTwoNumbers(numsExample, targetSum);

        Assertions.assertNotNull(result);
        Assertions.assertArrayEquals(expectedResult, result);
    }
}
