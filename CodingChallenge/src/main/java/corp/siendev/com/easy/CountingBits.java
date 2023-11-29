package corp.siendev.com.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 * <pre>
 *  Example 1:
 *      Input: n = 2
 *      Output: [0,1,1]
 *  Explanation:
 *      0 --> 0
 *      1 --> 1
 *      2 --> 10
 *
 *  Example 2:
 *      Input: n = 5
 *      Output: [0,1,1,2,1,2]
 *  Explanation:
 *      0 --> 0
 *      1 --> 1
 *      2 --> 10
 *      3 --> 11
 *      4 --> 100
 *      5 --> 101
 * </pre>
 */
public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    private static int[] countBits(int n) {
        return IntStream.range(0, n + 1)
                .map(value -> (int) Arrays.stream(Integer.toBinaryString(value).split(""))
                        .filter(binaryStr -> binaryStr.equals("1"))
                        .count())
                .toArray();
    }
}
