package corp.siendev.com.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
 * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <pre>
 *  Example 1:
 *      Input: jewels = "aA", stones = "aAAbbbb"
 *      Output: 3
 *
 *  Example 2:
 *      Input: jewels = "z", stones = "ZZ"
 *      Output: 0
 * </pre>
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    private static int numJewelsInStones(String jewels, String stones) {
        Set<String> stringSet = new HashSet<>(List.of(jewels.split("")));
        return (int) Stream.of(stones.split(""))
                .filter(stringSet::contains)
                .count();
    }
}
