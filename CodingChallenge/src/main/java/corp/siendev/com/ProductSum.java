/**
 * @author Iurii Golubnichenko
 *
 * We have a "special" array, which contains integers and might have other "special" arrays.
 * For example, something like this -> [23, 56, 1, [5, 7, 9, 12], [56, 34, [1, 2, 3], 6], 4]
 *
 * Need to write a method that is going to return the sum of the all elements in that array.
 * If the element is a nested "special" array, we need to sum up the elements in the "special" array
 * and then multiply the sum by the depth of the "special" array.
 *
 * For instance, if the input array is [33, [24, 4]], then the result should be 33 + (24 + 4) * 2 = 89;
 *
 * As we don't have such "special" array in Java (only multidimensional) we will use List<Object>
 *
 * For the solution below:
 * Time complexity will be O(n) and Space complexity O(d), where d is depth of nested arrays
 */
package corp.siendev.com;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {
    @SuppressWarnings("unchecked")
    public static long calculateProductSum(List<Object> elements, int depthOfArray) {
        long sum = 0;

        for (Object element: elements) {
            if (element instanceof ArrayList) {
                sum += calculateProductSum((ArrayList<Object>) element, ++depthOfArray);
            } else {
                sum += (long) element;
            }
        }
        return sum * depthOfArray;
    }
}
