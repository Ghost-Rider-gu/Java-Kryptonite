/**
 * @author Iurii Golubnichenko
 *
 * In mathematics, the Fibonacci is a sequence, in which each number is the sum of the two preceding ones.
 * The sequence commonly starts from 0 and 1, although some authors start the sequence from 1 and 1 or sometimes (as did Fibonacci) from 1 and 2.
 * Starting from 0 and 1, the first few values in the sequence are:[1] (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144)
 *
 * Example
 * ==================================================================
 * Input:  21    | 6 | 12
 * Output: 10946 | 8 | 144
 * ==================================================================
 *
 */
package corp.siendev.com;

public final class FibonacciSequence {
    public static double fibonacciWithRecursion(int number) {
        if (number < 0) {
            return 0;
        }
        if (number <= 1) {
            return number;
        } else {
            return fibonacciWithRecursion(number - 2) + fibonacciWithRecursion(number - 1);
        }
    }

    public static double fibonacciWithLoop(int number) {
        int result = 0;
        int countOne = 0;
        int countTwo = 1;

        for (int i = 1; i <= number - 1; i++) {
            result = countOne + countTwo;
            countOne = countTwo;
            countTwo = result;
        }
        return result;
    }
}
