package corp.siendev.com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given an array of strings words and a string chars.
 * A string is good if it can be formed by characters from chars (each character can only be used once).
 * Return the sum of lengths of all good strings in words.
 * <pre>
 *  Example 1:
 *      Input: words = ["cat","bt","hat","tree"], chars = "atach"
 *      Output: 6
 *  Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 *
 *  Example 2:
 *      Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 *      Output: 10
 *  Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 * </pre>
 */
public class WordsFormedByCharacters {
    public static void main(String[] args) {
        String[] words = new String[] { "hello", "world", "leetcode" };
        String chars = "welldonehoneyr";

        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        return Arrays.stream(words)
                .filter(s -> checkWord(chars, s))
                .map(String::length)
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static boolean checkWord(String chars, String word) {
        List<Character> listOfChars = new ArrayList<>(chars.length());
        int count = 0;

        for (char currentChar: chars.toCharArray()) {
            listOfChars.add(currentChar);
        }

        for (char currentChar: word.toCharArray()) {
            if (listOfChars.contains(currentChar)) {
                listOfChars.remove(Character.valueOf(currentChar));
                count++;
            }
        }

        return word.length() == count;
    }
}
