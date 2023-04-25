/**
 * @author Iurii Golubnichenko
 *
 * We have an array of integers and another array of integers.
 * Need to write a method that validates if the second array is a subsequence of the first one.
 * Order is matter.
 *
 * Example
 * ======================================================================================================
 * Input: givenArray = [3, 7, 15, 5, 4, -1, 0, 12, 45, -10]; subsequence = [3, 5, 45]
 * Output: true, givenArray contains subsequence in the same order.
 * ======================================================================================================
 *
 * Time complexity is O(n) and Space complexity is O(1).
 */
package corp.siendev.com;

public class SubsequenceValidation {
    public static boolean isValidSubsequence(int[] currentArray, int[] subsequence) {
        int currentArrayIndex = 0;
        int subsequenceIndex = 0;
        while (currentArrayIndex < currentArray.length && subsequenceIndex < subsequence.length) {
            if (currentArray[currentArrayIndex] == subsequence[subsequenceIndex]) {
                subsequenceIndex++;
            }
            currentArrayIndex++;
        }
        return subsequenceIndex == subsequence.length;
    }
}
