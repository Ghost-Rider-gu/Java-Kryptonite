package corp.siendev.com.easy;

import java.util.stream.IntStream;

/**
 * Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.
 * Return an integer denoting the sum of all numbers in the given range satisfying the constraint.
 * <pre>
 *  Example 1:
 *      Input: n = 7
 *      Output: 21
 *  Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
 *
 *  Example 2:
 *      Input: n = 10
 *      Output: 40
 *  Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
 *
 *  Example 3:
 *      Input: n = 9
 *      Output: 30
 *  Explanation: Numbers in the range [1, 9] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9. The sum of these numbers is 30.
 * </pre>
 */
public class SumMultiples {
    public static void main(String[] args) {
        System.out.println(sumOfMultiples(7));
    }

    private static int sumOfMultiples(int n) {
        return IntStream.range(1, n + 1)
                .filter(value -> (value % 3 == 0) || (value % 5 == 0) || (value % 7 == 0))
                .sum();
    }
}
