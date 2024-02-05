package corp.siendev.com.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * <pre>
 *  Example 1:
 *      Input: s = "leetcode"
 *      Output: 0
 *
 *  Example 2:
 *      Input: s = "loveleetcode"
 *      Output: 2
 *
 *  Example 3:
 *      Input: s = "aabb"
 *      Output: -1
 */
public class FirstUniqueCharacter {
    private static final String s = "loveleetcode";
    public static void main(String[] args) {
        System.out.println(getFirstUniqueCharacterTwo());
    }

    private static int getFirstUniqueCharacter() {
        String[] strings = s.split("");
        for (int i = 0; i < strings.length; i++) {
            if (getIndexes(s, strings[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    private static int getIndexes(String s, String charToFind) {
        return (int) Pattern.compile(Pattern.quote(charToFind))
                .matcher(s)
                .results()
                .map(MatchResult::start)
                .count();
    }

    private static int getFirstUniqueCharacterTwo() {
        Map<Character, Integer> mapOfChars = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char currentChar : chars) {
            if (mapOfChars.containsKey(currentChar)) {
                mapOfChars.put(currentChar, mapOfChars.get(currentChar) + 1);
            } else {
                mapOfChars.put(currentChar, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (mapOfChars.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
