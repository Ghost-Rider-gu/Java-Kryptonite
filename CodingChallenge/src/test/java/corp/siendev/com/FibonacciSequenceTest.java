/**
 * @author Iurii Golubnichenko
 *
 * Test cases for Fibonacci Sequence.
 */
package corp.siendev.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {
    private static final int TEST_NUMBER_1 = 12;
    private static final double EXPECTED_RESULT_1 = 144;

    private static final int TEST_NUMBER_2 = 6;
    private static final double EXPECTED_RESULT_2 = 8;

    @Test
    public void fibonacciWithRecursionTest() {
        final double result = FibonacciSequence.fibonacciWithRecursion(TEST_NUMBER_1);
        Assertions.assertEquals(EXPECTED_RESULT_1, result);
    }

    @Test
    public void fibonacciWithLoopTest() {
        final double result = FibonacciSequence.fibonacciWithLoop(TEST_NUMBER_2);
        Assertions.assertEquals(EXPECTED_RESULT_2, result);
    }

    @Test
    public void fibonacciBothMethodTest() {
        final double loopResult = FibonacciSequence.fibonacciWithLoop(TEST_NUMBER_2);
        final double recursionResult = FibonacciSequence.fibonacciWithRecursion(TEST_NUMBER_2);
        Assertions.assertEquals(loopResult, recursionResult);
    }
}
