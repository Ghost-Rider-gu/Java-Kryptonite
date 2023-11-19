package corp.siendev.com.medium;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given an integer array nums, your goal is to make all elements in nums equal. To complete one operation, follow these steps:
 *     Find the largest value in nums. Let its index be i (0-indexed) and its value be largest. If there are multiple elements with the largest value, pick the smallest i.
 *     Find the next largest value in nums strictly smaller than largest. Let its value be nextLargest.
 *     Reduce nums[i] to nextLargest.
 * Return the number of operations to make all elements in nums equal.
 * <pre>
 *  Example 1:
 *      Input: nums = [5,1,3]
 *      Output: 3
 *  Explanation: It takes 3 operations to make all elements in nums equal:
 *      1. largest = 5 at index 0. nextLargest = 3. Reduce nums[0] to 3. nums = [3,1,3].
 *      2. largest = 3 at index 0. nextLargest = 1. Reduce nums[0] to 1. nums = [1,1,3].
 *      3. largest = 3 at index 2. nextLargest = 1. Reduce nums[2] to 1. nums = [1,1,1].
 *
 *  Example 2:
 *      Input: nums = [1,1,1]
 *      Output: 0
 *  Explanation: All elements in nums are already equal.
 *
 *  Example 3:
 *      Input: nums = [1,1,2,2,3]
 *      Output: 4
 *  Explanation: It takes 4 operations to make all elements in nums equal:
 *      1. largest = 3 at index 4. nextLargest = 2. Reduce nums[4] to 2. nums = [1,1,2,2,2].
 *      2. largest = 2 at index 2. nextLargest = 1. Reduce nums[2] to 1. nums = [1,1,1,2,2].
 *      3. largest = 2 at index 3. nextLargest = 1. Reduce nums[3] to 1. nums = [1,1,1,1,2].
 *      4. largest = 2 at index 4. nextLargest = 1. Reduce nums[4] to 1. nums = [1,1,1,1,1].
 * </pre>
 */
public class ReductionOperations {
    private static int result = 0;
    public static void main(String[] args) {
        int[] nums = new int[] { 5, 1, 3 };
        System.out.println(reductionOperations(nums));
    }

    private static int reductionOperations(int[] nums) {
        while (true) {
            boolean containsTheSameElement = IntStream.of(nums)
                    .allMatch(value -> value == nums[0]);
            if (containsTheSameElement) {
                return result;
            }

            int firstLargeNumber = IntStream.of(nums)
                    .max()
                    .getAsInt();
            int secondLargeNumber = IntStream.of(nums)
                    .filter(value -> value < firstLargeNumber)
                    .max()
                    .getAsInt();

            changeValueInArray(nums, firstLargeNumber, secondLargeNumber);
        }
    }

    private static void changeValueInArray(int[] nums, int firstLargeNumber, int secondLargeNumber) {
        int indexOfElement = IntStream.range(0, nums.length)
                .filter(i -> nums[i] == firstLargeNumber)
                .findFirst()
                .orElse(-1);
        nums[indexOfElement] = secondLargeNumber;
        result++;
    }

    private static int reductionOperationsWithLoops(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int cursor = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                cursor++;
            }
            result += cursor;
        }

        return result;
    }
}
