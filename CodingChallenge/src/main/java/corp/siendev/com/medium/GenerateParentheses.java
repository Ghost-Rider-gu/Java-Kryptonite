package corp.siendev.com.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <pre>
 *  Example 1:
 *      Input: n = 3
 *      Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 *  Example 2:
 *      Input: n = 1
 *      Output: ["()"]
 * </pre>
 */
public class GenerateParentheses {
    private static final List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    private static List<String> generateParenthesis(int n) {
        findPairOfParentheses("", n, n);
        return result;
    }

    private static void findPairOfParentheses(String currentPairs, int leftParentheses, int rightParentheses) {
        if (leftParentheses != 0) {
            findPairOfParentheses(currentPairs + "(", leftParentheses - 1, rightParentheses);
        }
        if (rightParentheses != 0 && leftParentheses < rightParentheses) {
            findPairOfParentheses(currentPairs + ")", leftParentheses, rightParentheses - 1);
        }
        if (leftParentheses == 0 && rightParentheses == 0) {
            result.add(currentPairs);
        }
    }
}
