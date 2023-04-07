/**
 * Let's say we have an array of integers, and we want to calculate the sum, min, max and average of those numbers.
 * For instance, we have [1, 3, 5, 7, 8], so min = 1, max = 8, sum = 24, avg = 4
 */
package corp.siendev.com;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStatistic {
    public static IntSummaryStatistics getIntStatistic(int[] arrayOfIntegers) {
        List<Integer> listOfIntegers = IntStream.of(arrayOfIntegers)
                .boxed()
                .collect(Collectors.toList());

        return listOfIntegers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
    }

    public static String printIntStatistic(int[] arrayOfInteger) {
        IntSummaryStatistics statistics = getIntStatistic(arrayOfInteger);
        return statistics.toString();
    }
}
