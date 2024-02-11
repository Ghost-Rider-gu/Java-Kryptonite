package corp.siendev.com.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode task - "(2418) Sort the People"
 * You are given an array of strings names, and an array heights that consists of distinct positive integers.
 * Both arrays are of length n. For each index i, names[i] and heights[i] denote the name and height of the ith person.
 * Return names sorted in descending order by the people's heights.
 * <pre>
 *  Example 1:
 *      Input: names = ["Mary","John","Emma"], heights = [180,165,170]
 *      Output: ["Mary","Emma","John"]
 *      Explanation: Mary is the tallest, followed by Emma and John.
 *
 *  Example 2:
 *      Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
 *      Output: ["Bob","Alice","Bob"]
 *      Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 */
public class SortThePeople {
    public static void main(String[] args) {
        String[] names = new String[] { "Mary", "John", "Emma" };
        int[] heights = new int[] { 180, 165, 170 };

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    private static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> mapOfNames = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            mapOfNames.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] result = new String[names.length];
        for (int i = heights.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = mapOfNames.get(heights[i]);
        }

        return result;
    }
}
