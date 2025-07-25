package corp.siendev.com.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * <pre>
 *     Example 1:
 *      Input: nums = [1,2,3,1]
 *      Output: true
 *
 *     Example 2:
 *      Input: nums = [1,2,3,4]
 *      Output: false
 *
 *     Example 3:
 *      Input: nums = [1,1,1,3,3,4,3,2,4,2]
 *      Output: true
 * </pre>
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 4 };
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateVersion2(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int number: nums) {
            if (uniqueElements.contains(number)) {
                return true;
            } else {
                uniqueElements.add(number);
            }
        }
        return false;
    }

    private static boolean containsDuplicateVersion2(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        Arrays.sort(nums);
        int currentNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentNum == nums[i]) {
                return true;
            } else {
                currentNum = nums[i];
            }
        }
        return false;
    }
}
