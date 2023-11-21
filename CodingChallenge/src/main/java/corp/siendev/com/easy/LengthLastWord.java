package corp.siendev.com.easy;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * <pre>
 *  Example 1:
 *      Input: s = "Hello World"
 *      Output: 5
 *  Explanation: The last word is "World" with length 5.
 *
 *  Example 2:
 *      Input: s = "   fly me   to   the moon  "
 *      Output: 4
 *  Explanation: The last word is "moon" with length 4.
 *
 *  Example 3:
 *      Input: s = "luffy is still joyboy"
 *      Output: 6
 *  Explanation: The last word is "joyboy" with length 6.
 * </pre>
 */
public class LengthLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str));
    }

    private static int lengthOfLastWord(String str) {
        String[] strArray = str.trim().split(" ");
        return strArray[strArray.length - 1].length();
    }
}
