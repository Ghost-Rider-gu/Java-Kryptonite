/**
 * @author Iurii Golubnichenko
 * <p>
 * Given a string and we need to check if that string is palindrome (reads the same in reverse order)
 * As a result we must return True or False.
 * </p>
 * Example
 * ======================================================================================================
 * Input: givenString = "kayak";
 * Output: true
 * Input: givenString = "saippuakivikauppias";
 * Output: true
 * Input: givenString = "hello";
 * Output: false
 * ======================================================================================================
 */
package corp.siendev.com.easy;

public class PalindromeChecking {
    /**
     * Just using StringBuilder to solve the problem - all you need is Java :)
     * @param givenString currentString
     * @return true or false
     */
    public static boolean isPalindrome(String givenString) {
        StringBuilder result = new StringBuilder(givenString);
        result.reverse();
        return givenString.contentEquals(result);
    }

    /**
     * Time complexity O(n) and Space complexity O(1)
     * @param givenString current string
     * @return true or false
     */
    public static boolean isPalindromeWithPointers(String givenString) {
        int leftIndex = 0;
        int rightIndex = givenString.length() - 1;
        while (leftIndex < rightIndex) {
            if (givenString.charAt(leftIndex) != givenString.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    /**
     * Time complexity O(n) and Space complexity O(n)
     * @param givenString current string
     * @return true or false
     */
    public static boolean isPalindromeWithForLoop(String givenString) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = givenString.length() - 1; i >= 0; i--) {
            reversedString.append(givenString.charAt(i));
        }
        return givenString.contentEquals(reversedString);
    }
}
