/**
 * @author Iurii Golubnichenko
 *
 * There is an array of integers and an integer target.
 * You need to write a function / method that will return indices of the two numbers such that they add up to target.
 *
 * Example
 * ==================================================================
 * Input: nums = [3, 7, 15, 5, 4], target = 9
 * Output: [5, 4] -> because 5 + 4 == 9
 * ==================================================================
 *
 * For the solution below:
 * Time complexity will be (O)n and Space complexity (O)n -> because we use additional structure to save data.
 */
package corp.siendev.com;

import java.util.HashSet;
import java.util.Set;

public final class TwoSum {
    public static int[] sumOfTwoNumbers(int[] nums, int target) {
        Set<Integer> potentialCandidates = new HashSet<>();

        for (int firstNumber: nums) {
            int secondNumber = target - firstNumber;
            if (potentialCandidates.contains(secondNumber)) {
                return new int[] { secondNumber, firstNumber };
            } else {
                potentialCandidates.add(firstNumber);
            }
        }
        return new int[0];
    }
}
