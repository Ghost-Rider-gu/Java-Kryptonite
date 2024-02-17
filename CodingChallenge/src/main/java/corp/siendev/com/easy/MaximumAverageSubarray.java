package corp.siendev.com.easy;

/**
 * Leetcode task - "(643) Maximum Average Subarray I"
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 * <pre>
 *  Example 1:
 *      Input: nums = [1,12,-5,-6,50,3], k = 4
 *      Output: 12.75000
 *  Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 *
 *  Example 2:
 *      Input: nums = [5], k = 1
 *      Output: 5.00000
 */
public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    private static double findMaxAverage(int[] nums, int k) {
        double result = Double.NEGATIVE_INFINITY;
        double subSum = 0;
        int pointer = 0;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            subSum += nums[i];
            if (i >= (k -1)) {
                result = Math.max(subSum / k, result);
                subSum -= nums[pointer];
                pointer++;
            }
        }

        return result;
    }
}
