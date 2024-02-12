package corp.siendev.com.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Leetcode task - "(229) Majority Element II"
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * <pre>
 *  Example 1:
 *      Input: nums = [3,2,3]
 *      Output: [3]
 *
 *  Example 2:
 *      Input: nums = [1]
 *      Output: [1]
 *
 *  Example 3:
 *      Input: nums = [1,2]
 *      Output: [1,2]
 * </pre>
 */
public class MajorityElementTwo {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 2, 1, 1, 1, 2, 2, 5 };
        System.out.println(majorityElement(nums));
    }

    private static List<Integer> majorityElement(int[] nums) {
        int majorCount = nums.length / 3;

        Map<Integer, Integer> mapOfNumbers = new HashMap<>();
        for (int num: nums) {
            if (mapOfNumbers.containsKey(num)) {
                mapOfNumbers.put(num, mapOfNumbers.get(num) + 1);
            } else {
                mapOfNumbers.put(num, 1);
            }
        }

        return mapOfNumbers.entrySet()
                .stream()
                .filter(value -> value.getValue() > majorCount)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
