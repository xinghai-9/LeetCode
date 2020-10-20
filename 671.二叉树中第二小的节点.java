import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=671 lang=java
 *
 * [671] 二叉树中第二小的节点
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        return findSecondMinimumValue(root, root.val);
    }

    public int findSecondMinimumValue(TreeNode node, int min){
        if(node == null){
            return -1;
        }

        if(node.val > min){
            return node.val;
        }

        int left = findSecondMinimumValue(node.left, min);
        int right = findSecondMinimumValue(node.right, min);

        if(left == -1){
            return right;
        }

        if(right == -1){
            return left;
        }

        return Math.min(left, right);
    }
}
// @lc code=end

