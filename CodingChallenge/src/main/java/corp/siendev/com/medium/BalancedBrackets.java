package corp.siendev.com.medium;

import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *     1. Open brackets must be closed by the same type of brackets.
 *     2. Open brackets must be closed in the correct order.
 *     3. Every close bracket has a corresponding open bracket of the same type.
 * Time complexity O(n), Space complexity O(n)
 */
public class BalancedBrackets {
    private static final String[] STRINGS_OF_BRACKETS = new String[] {"(({[([])]}))", "(({[([)])]}))", "(hello[]{how}are{you})"};

    public static void main(String[] args) {
        for (String stringsOfBracket : STRINGS_OF_BRACKETS) {
            if (bracketsAreBalanced(stringsOfBracket)) {
                System.out.println("String of brackets is balanced");
            } else {
                System.out.println("String of brackets isn't balanced");
            }
        }
    }

    private static boolean bracketsAreBalanced(String stringOfBrackets) {
        if (stringOfBrackets.isBlank()) {
            return false;
        }

        String openBrackets = "([{";
        String closeBrackets = ")]}";
        Map<String, String> matchingBrackets = Map.of(")", "(", "]", "[", "}", "{");
        Stack<String> characterStack = new Stack<>();

        for (String character : stringOfBrackets.split("")) {
            if (openBrackets.contains(character)) {
                characterStack.push(character);
            } else if (closeBrackets.contains(character)) {
                if (characterStack.isEmpty()) {
                    return false;
                }
                if (matchingBrackets.get(character).equals(characterStack.lastElement())) {
                    characterStack.pop();
                } else {
                    return false;
                }
            }
        }

        return characterStack.isEmpty();
    }
}
