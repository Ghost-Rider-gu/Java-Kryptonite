/**
 * @author Iurii Golubnichenko
 *
 * Test cases for subsequence validation challenge.
 */
package corp.siendev.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubsequenceValidationTest {
    private static final int[] currentArray = new int[] { 34, 56, 78, 2, 56, 9, -12, 4, 67 };
    private static final int[] subsequence = new int [] { 56, 9, -12, 4 };
    private static final int[] anotherSubsequence = new int[] { 5, 0, 23, 12 };

    @Test
    public void isValidSubsequenceTest() {
        boolean result = SubsequenceValidation.isValidSubsequence(currentArray, subsequence);
        Assertions.assertTrue(result);
    }

    @Test
    public void isNotValidSubsequence() {
        boolean result = SubsequenceValidation.isValidSubsequence(currentArray, anotherSubsequence);
        Assertions.assertFalse(result);
    }
}
