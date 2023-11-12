/**
 * @author Iurii Golubnichenko
 *
 * Test cases for Palindrome checking challenge.
 */
package corp.siendev.com.easy;

import corp.siendev.com.easy.PalindromeChecking;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckingTest {
    private static final String stringExampleOne = "saippuakivikauppias";
    private static final String stringExampleTwo = "kayak";
    private static final String stringExampleThree = "deed";
    private static final String stringExampleFour = "Hello World";

    @Test
    public void isPalindromeTest() {
        boolean result = PalindromeChecking.isPalindrome(stringExampleOne);
        Assertions.assertTrue(result);
    }

    @Test
    public void isPalindromeWithPointersTest() {
        boolean result = PalindromeChecking.isPalindromeWithPointers(stringExampleTwo);
        Assertions.assertTrue(result);
    }

    @Test
    public void isPalindromeWithForLoopTest() {
        boolean result = PalindromeChecking.isPalindromeWithForLoop(stringExampleThree);
        Assertions.assertTrue(result);
    }

    @Test
    public void isNotPalindromeTest() {
        boolean result = PalindromeChecking.isPalindrome(stringExampleFour);
        Assertions.assertFalse(result);
    }
}
