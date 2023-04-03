/**
 * @author Iurii Golubnichenko
 *
 * Some common questions on interview regarding Collections
 *
 * For the same results you can use Apache Commons or Google Guava libraries.
 * In here we use only Java Core.
 *
 */
package corp.siendev.com;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class CollectionConversion {
    public static List<Integer> convertArrayToListFirst(int[] arrayOfIntegers) {
        final List<Integer> listOfIntegers = new ArrayList<>();
        for (int element: arrayOfIntegers) {
            listOfIntegers.add(element);
        }

        return listOfIntegers;
    }

    public static List<Integer> convertArrayToListSecond(int[] arrayOfIntegers) {
        return IntStream.of(arrayOfIntegers)
                .boxed()
                .collect(Collectors.toList());
        /**
         * or you can simply use Arrays
         * return Arrays.stream(arrayOfIntegers).boxed().collect(Collectors.toList());
         */
    }

    public static int[] convertListToArrayFirst(List<Integer> listOfIntegers) {
        final int[] arrayOfIntegers = new int[listOfIntegers.size()];
        for (int i = 0; i < listOfIntegers.size(); i++) {
            arrayOfIntegers[i] = listOfIntegers.get(i);
        }

        return arrayOfIntegers;
    }

    public static int[] convertListToArraySecond(List<Integer> listOfIntegers) {
        return listOfIntegers.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static Set<Integer> listToSetFirst(List<Integer> listOfIntegers) {
        return new HashSet<>(listOfIntegers);
    }

    public static Set<Integer> listToSetSecond(List<Integer> listOfInteger) {
        return listOfInteger.stream()
                .collect(Collectors.toSet());
    }
}
