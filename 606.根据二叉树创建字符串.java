import java.util.HashSet;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=606 lang=java
 *
 * [606] 根据二叉树创建字符串
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(t);
        Set<TreeNode> hashSet = new HashSet<>();
        StringBuilder res = new StringBuilder();

        while (!stack.isEmpty()) {
            t = stack.peek();
            if (hashSet.contains(t)) {
                stack.pop();
                res.append(")");
            } else {
                hashSet.add(t);
                res.append("(" + t.val);

                if (t.left == null && t.right != null) {
                    res.append("()");
                }

                if (t.right != null) {
                    stack.push(t.right);
                }

                if (t.left != null) {
                    stack.push(t.left);
                }
            }
        }

        return res.substring(1, res.length() - 1);
    }
}
// @lc code=end
