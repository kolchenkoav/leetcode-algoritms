package algoritms;

import util.TreeNode;

/**
 * https://leetcode.com/problems/balanced-binary-tree/description/
 * 110. Balanced Binary Tree
 *
 *  * Definition for a binary tree node.
 *  * public class TreeNode {
 *  *     int val;
 *  *     TreeNode left;
 *  *     TreeNode right;
 *  *     TreeNode() {}
 *  *     TreeNode(int val) { this.val = val; }
 *  *     TreeNode(int val, TreeNode left, TreeNode right) {
 *  *         this.val = val;
 *  *         this.left = left;
 *  *         this.right = right;
 *  *     }
 *  * }
 *
 *  Этот код определяет, является ли двоичное дерево сбалансированным. Сбалансированное дерево - это дерево,
 *      в котором разница между глубинами левого и правого поддеревьев для каждого узла не превышает 1.
 *
 * Метод `isBalanced()` принимает узел корня дерева в качестве параметра и возвращает `true`, если дерево сбалансировано,
 *      и `false` в противном случае. Если корень равен `null`, то дерево считается сбалансированным.
 *
 * Метод `isBalancedChildren()` проверяет, является ли разница между глубинами левого и правого поддеревьев для текущего узла не более 1.
 *
 * Метод `depth()` возвращает глубину узла. Если узел равен `null`, то глубина равна 0.
 *      В противном случае глубина равна 1 плюс максимальная глубина левого и правого поддеревьев.
 *
 * Таким образом, этот код определяет, является ли двоичное дерево сбалансированным, проверяя, что разница между
 *      глубинами левого и правого поддеревьев для каждого узла не превышает 1.
 *
 */
public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isBalancedChildren(root) && isBalanced(root.left) && isBalanced(root.right);
    }

    private static boolean isBalancedChildren(TreeNode root) {
        return Math.abs(depth(root.left) - depth(root.right)) <= 1;
    }

    private static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var leftChildDepth = 1 + depth(root.left);
        var rightChildDepth = 1 + depth(root.right);
        return Math.max(leftChildDepth, rightChildDepth);
    }
}
