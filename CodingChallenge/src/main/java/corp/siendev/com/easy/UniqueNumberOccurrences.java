package corp.siendev.com.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 * <pre>
 *  Example 1:
 *      Input: arr = [1,2,2,1,1,3]
 *      Output: true
 *  Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 *
 *  Example 2:
 *      Input: arr = [1,2]
 *      Output: false
 *
 *  Example 3:
 *      Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 *      Output: true
 */
public class UniqueNumberOccurrences {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 2, 1, 1, 3 };
        System.out.println(uniqueOccurrences(arr));
    }

    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mapOfOccurences = new HashMap<>();
        for (int number: arr) {
            if (mapOfOccurences.containsKey(number)) {
                mapOfOccurences.put(number, mapOfOccurences.get(number) + 1);
            } else {
                mapOfOccurences.put(number, 1);
            }
        }

        return mapOfOccurences.values().toArray().length == (new HashSet<>(mapOfOccurences.values())).size();
    }
}
