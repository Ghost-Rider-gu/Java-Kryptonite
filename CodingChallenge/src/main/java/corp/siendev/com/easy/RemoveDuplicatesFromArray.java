package corp.siendev.com.easy;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *     1. Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
 *        The remaining elements of nums are not important as well as the size of nums.
 *     2. Return k.
 * Custom Judge (leetcode):
 * The judge will test your solution with the following code:
 * <pre>
 *  int[] nums = [...]; // Input array
 *  int[] expectedNums = [...]; // The expected answer with correct length
 *
 *  int k = removeDuplicates(nums); // Calls your implementation
 *
 *  assert k == expectedNums.length;
 *  for (int i = 0; i < k; i++) {
 *      assert nums[i] == expectedNums[i];
 *  }
 * </pre>
 */
public class RemoveDuplicatesFromArray {
    private static final int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

    public static void main(String[] args) {
        System.out.printf("1. Unique elements: %d \n\r", removeDuplicates(nums));

        // Second approach when you need to sort array in different way (unique elements go first then the rest of the elements)
        System.out.printf("2. Unique elements: %d \n\r", removeDuplicatesWithSorting(nums));
        System.out.println(Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {
        if (arrayIsNotPresent(nums)) {
            return 0;
        }

        Set<Integer> uniqueElements = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return uniqueElements.size();
    }

    private static int removeDuplicatesWithSorting(int[] nums) {
        if (arrayIsNotPresent(nums)) {
            return 0;
        }

        int uniqueElements = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueElements] = nums[i];
                uniqueElements++;
            }
        }

        return uniqueElements;
    }

    private static boolean arrayIsNotPresent(int[] nums) {
        return Objects.isNull(nums) || nums.length < 1;
    }
}
