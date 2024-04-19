package algoritms;

import util.TreeNode;
import java.util.LinkedList;
import java.util.Objects;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 * 111. Minimum Depth of Binary Tree
 *
 * /**
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
 *  Этот код находит минимальную глубину двоичного дерева. Алгоритм работает следующим образом:
 *
 * 1. Если корень дерева равен `null`, то глубина равна 0.
 * 2. Создается очередь `queue`, которая будет содержать узлы дерева.
 * 3. В цикле `while` перебираются узлы из очереди.
 * 4. Если узел не имеет ни левого, ни правого потомка, то глубина равна текущей глубине и цикл прерывается.
 * 5. Если узел имеет потомков, то они добавляются в очередь.
 * 6. Глубина увеличивается на 1 и цикл продолжается.
 *
 * Таким образом, этот код находит минимальную глубину двоичного дерева.
 *
 */
public class MinimumDepthOfBinaryTree {

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var depth = 1;
        var queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            var nodesCount = queue.size();
            for (int i = 0; i < nodesCount; i++) {
                var node = Objects.requireNonNull(queue.poll());

                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}