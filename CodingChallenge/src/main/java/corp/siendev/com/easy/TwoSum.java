/**
 * @author Iurii Golubnichenko
 * There is an array of integers and an integer as a target.
 * You need to write a method that will return indices of the two numbers such that they add up to target.
 * <pre>
 *  Example
 *  ==================================================================
 *      Input: nums = [3, 7, 15, 5, 4], target = 9
 *      Output: [5, 4] -> because 5 + 4 == 9
 *  ==================================================================
 * </pre>
 */
package corp.siendev.com.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class TwoSum {
    /**
     * Solution with loops.
     * Time complexity will be O(n^2) and Space complexity O(1).
     *
     * @param nums array of integers
     * @param target the target sum of two numbers from given array
     * @return int[x, y]
     */
    public static int[] sumOfTwoNumbersWithLoops(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 1; i++) {
            int firstNumber = nums[i];
            for (int j = i + 1; j <= nums.length - 1; j++) {
                int secondNumber = nums[j];
                if (firstNumber + secondNumber == target) {
                    return new int[] { firstNumber, secondNumber };
                }
            }
        }
        return new int[0];
    }

    /**
     * Solution that relly on sorting + left and right pointers of the array.
     * Time complexity will be O(n log(n)) and Space complexity O(1).
     *
     * @param nums array of integers
     * @param target the target sum of two numbers from given array
     * @return int[x, y]
     */
    public static int[] sumOfTwoNumbersWithPointers(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        Arrays.sort(nums);

        while (leftPointer < rightPointer) {
            int sum = nums[leftPointer] + nums[rightPointer];
            if (sum == target) {
                return new int[] { nums[leftPointer], nums[rightPointer] };
            }
            if (sum < target) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return new int[0];
    }

    /**
     * Time complexity will be O(n) and Space complexity O(n) -> because we use additional structure to save data.
     *
     * @param nums array of integers
     * @param target the target sum of two numbers from given array
     * @return int[x, y]
     */
    public static int[] sumOfTwoNumbers(int[] nums, int target) {
        Set<Integer> potentialCandidates = new HashSet<>();
        for (int firstNumber: nums) {
            int secondNumber = target - firstNumber;
            if (potentialCandidates.contains(secondNumber)) {
                return new int[] { firstNumber, secondNumber };
            } else {
                potentialCandidates.add(firstNumber);
            }
        }
        return new int[0];
    }
}
