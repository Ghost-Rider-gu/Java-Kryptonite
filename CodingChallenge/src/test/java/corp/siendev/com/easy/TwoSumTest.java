/**
 * @author Iurii Golubnichenko
 *
 * Test cases for TwoSum challenge.
 */
package corp.siendev.com.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    private static final int[] nums = new int[] { 3, 7, 15, 5, 4 };
    private static final int[] expectedResult = new int[] { 5, 4 };
    private static final int targetSum = 9;

    @Test
    public void sumOfTwoNumbersTest() {
        int[] result = TwoSum.sumOfTwoNumbers(nums, targetSum);
        Assertions.assertThat(expectedResult).contains(result);
    }

    @Test
    public void sumOfTwoNumbersWithLoopsTest() {
        int[] result = TwoSum.sumOfTwoNumbersWithLoops(nums, targetSum);
        Assertions.assertThat(expectedResult).contains(result);
    }

    @Test
    public void sumOfTwoNumbersWithPointersTest() {
        int[] result = TwoSum.sumOfTwoNumbersWithPointers(nums, targetSum);
        Assertions.assertThat(expectedResult).contains(result);
    }
}
