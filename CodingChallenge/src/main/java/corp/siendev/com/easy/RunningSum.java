package corp.siendev.com.easy;

import java.util.Arrays;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * <pre>
 *  Example 1:
 *      Input: nums = [1,2,3,4]
 *      Output: [1,3,6,10]
 *  Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 *
 *  Example 2:
 *      Input: nums = [1,1,1,1,1]
 *      Output: [1,2,3,4,5]
 *  Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 *
 *  Example 3:
 *      Input: nums = [3,1,2,10,1]
 *      Output: [3,4,6,16,17]
 * </pre>
 */
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    private static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = sum(nums, i);
        }

        return result;
    }

    private static int sum(int[] nums, int lastIndex) {
        int sum = 0;
        for (int i = 0; i <= lastIndex; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
