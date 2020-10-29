/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根到叶子节点数字之和
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {

//     public int sumNumbers(TreeNode root) {
//         int sum = 0;
//         StringBuilder sb = new StringBuilder();
//         return dfs(root,sb,sum);
//     }

//     public int dfs(TreeNode root,StringBuilder sb, int sum) {
//         if(root != null){
            
//             sb.append(root.val);

//             if(root.left == null && root.right == null){
//                 sum += Integer.parseInt(sb.toString());
//             }

//             sum = dfs(root.left, sb, sum);
//             sum = dfs(root.right, sb, sum);
//             sb.delete(sb.length() - 1, sb.length());

//         }

//         return sum;
//     }
// }

class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }
        int sum = prevSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            return dfs(root.left, sum) + dfs(root.right, sum);
        }
    }
}

// @lc code=end

