/**
 * @author Iurii Golubnichenko
 * <p>
 * Given an array (we do not know if it's sorted or unsorted). Need to find three largest numbers in this array.
 * As a result we must output a sorted array with those three numbers.
 * </p>
 * Example
 * ======================================================================================================
 * Input: givenArray = [3, 7, 15, 5, 4, -1, 0, 12, 45, -10];
 * Output: [12, 15, 45]
 * ======================================================================================================
 *
 */
package corp.siendev.com;

import java.util.Arrays;

public class ThreeLargestNumbers {
    /**
     * With sorting - Time complexity O(n log(n)) and Space complexity O(n)
     *
     * @param arrayOfNumbers - current array
     * @return a sorted array of three numbers
     */
    public static int[] findThreeLargestNumbersWithSorting(int[] arrayOfNumbers) {
        Arrays.sort(arrayOfNumbers);
        return Arrays.stream(arrayOfNumbers)
                .skip(arrayOfNumbers.length - 3)
                .toArray();
    }

    /**
     * Without sorting - Time complexity O(n) and Time complexity O(1)
     *
     * @param arrayOfNumbers - current array
     * @return a sorted array of three numbers
     */
    public static int[] findThreeLargestNumbers(int[] arrayOfNumbers) {
        int[] result = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        for (int number : arrayOfNumbers) {
            updateResult(result, number);
        }
        return result;
    }

    private static void updateResult(int[] result, int number) {
        if (number > result[2]) {
            shiftAndUpdate(result, number, 2);
        } else if (number > result[1]) {
            shiftAndUpdate(result, number, 1);
        } else if (number > result[0]) {
            shiftAndUpdate(result, number, 0);
        }
    }

    private static void shiftAndUpdate(int[] result, int number, int index) {
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                result[i] = number;
            } else {
                result[i] = result[i + 1];
            }
        }
    }
}
