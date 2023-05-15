/**
 * @author Iurii Golubnichenko
 * <p>
 * Given a binary tree and a target number, we need to find the closest value to the target number in that tree.
 * As a result we must output a number.
 * </p>
 */
package corp.siendev.com;

public class ClosestValueInBinaryTree {
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

    /**
     * Time complexity is O(log(N)) (in worst case scenario it will be O(N)) and Space complexity is O(1)
     * @param tree given a binary tree
     * @param targetValue given a target value that we need to find
     * @return a closest value
     */
    public static int findClosestValue(BinaryTree tree, int targetValue) {
        BinaryTree currentNode = tree;
        int closest = Integer.MAX_VALUE;
        while (currentNode != null) {
            if (Math.abs(targetValue - closest) > Math.abs(targetValue - currentNode.value)) {
                closest = currentNode.value;
            }
            if (targetValue < currentNode.value) {
                currentNode = currentNode.leftBranch;
            } else if (targetValue > currentNode.value) {
                currentNode = currentNode.rightBranch;
            } else {
                return closest;
            }
        }
        return closest;
    }

    /**
     * Time complexity is O(log(N)) (in worst case scenario it will be O(N)) and Space complexity is O(log(N)) (worst O(N))
     * @param tree given a binary tree
     * @param targetValue given a target value that we need to find
     * @return a closest value
     */
    public static int findClosestValueWithRecursion(BinaryTree tree, int targetValue) {
        return processClosestValue(tree, targetValue, Integer.MAX_VALUE);
    }

    private static int processClosestValue(BinaryTree tree, int targetValue, int closest) {
        if (Math.abs(targetValue - closest) > Math.abs(targetValue - tree.value)) {
            closest = tree.value;
        }
        if (targetValue < tree.value && tree.leftBranch != null) {
            return processClosestValue(tree.leftBranch, targetValue, closest);
        } else if (targetValue > tree.value && tree.rightBranch != null) {
            return processClosestValue(tree.rightBranch, targetValue, closest);
        } else {
            return closest;
        }
    }
}
