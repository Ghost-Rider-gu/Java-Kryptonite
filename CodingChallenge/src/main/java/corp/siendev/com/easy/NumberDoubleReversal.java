package corp.siendev.com.easy;

/**
 * Reversing an integer means to reverse all its digits.
 * For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
 * Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.
 * <pre>
 *  Example 1:
 *      Input: num = 526
 *      Output: true
 *  Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.
 *
 *  Example 2:
 *      Input: num = 1800
 *      Output: false
 *  Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not equal num.
 *
 *  Example 3:
 *      Input: num = 0
 *      Output: true
 *  Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.
 * </pre>
 */
public class NumberDoubleReversal {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
    }

    private static boolean isSameAfterReversals(int num) {
        if (num <= 9) {
            return true;
        }

        int result = reverse(reverse(num));
        return result == num;
    }

    private static int reverse(int number) {
        int result = 0;

        while (number != 0) {
            int mod = number % 10;
            result = result * 10 + mod;
            number /= 10;
        }

        return result;
    }
}
