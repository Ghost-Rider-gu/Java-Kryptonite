package corp.siendev.com.easy;

import java.util.Arrays;

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n
 * where ans[i] == nums[i] and ans[i + n] == nums[i] (for 0 <= i < n (0-indexed)).
 * Specifically, ans is the concatenation of two nums arrays. Return the array ans.
 * <pre>
 *  Example 1:
 *      Input: nums = [1,2,1]
 *      Output: [1,2,1,1,2,1]
 *  Explanation: The array ans is formed as follows:
 *      - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 *      - ans = [1,2,1,1,2,1]
 *
 *  Example 2:
 *      Input: nums = [1,3,2,1]
 *      Output: [1,3,2,1,1,3,2,1]
 *  Explanation: The array ans is formed as follows:
 *      - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
 *      - ans = [1,3,2,1,1,3,2,1]
 * </pre>
 */
public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 2, 1 };
        System.out.println(Arrays.toString(getConcatenation(nums)));
        System.out.println(Arrays.toString(getConcatenationWithLoop(nums)));
    }

    private static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);

        return result;
    }

    private static int[] getConcatenationWithLoop(int[] nums) {
        int sizeOfSourceArray = nums.length;
        int[] result = new int[sizeOfSourceArray * 2];
        for (int i = 0; i < sizeOfSourceArray; i++) {
            result[i] = nums[i];
            result[i + sizeOfSourceArray] = nums[i];
        }

        return result;
    }
}
