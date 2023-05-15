/**
 * @author Iurii Golubnichenko
 * <p>
 * Given a binary tree, we need to calculate the sum in each branch of that tree.
 * As a result we must output a list of sums.
 * </p>
 * =================================================================================
 * Time complexity is O(N) and Space complexity is O(N)
 * =================================================================================
 */
package corp.siendev.com;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree leftBranch;
        BinaryTree rightBranch;

        public BinaryTree(int value) {
            this.value = value;
            this.leftBranch = null;
            this.rightBranch = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums = new ArrayList<>();
        calculateTheSum(root, 0, sums);
        return sums;
    }

    private static void calculateTheSum(BinaryTree node, int currentSum, List<Integer> sums) {
        if (node == null) {
            return;
        }
        int newCurrentSum = currentSum + node.value;
        if (node.leftBranch == null && node.rightBranch == null) {
            sums.add(newCurrentSum);
            return;
        }
        calculateTheSum(node.leftBranch, newCurrentSum, sums);
        calculateTheSum(node.rightBranch, newCurrentSum, sums);
    }
}
