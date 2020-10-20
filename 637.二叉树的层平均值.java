import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=637 lang=java
 *
 * [637] 二叉树的层平均值
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        // List<Double> res = new ArrayList<>();
        // if(root == null) {
        // return res;
        // }

        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);

        // while(!queue.isEmpty()){
        // double sum = 0;
        // int length = queue.size();
        // for(int i = 0; i <length; i++){
        // TreeNode node = queue.poll();
        // sum += node.val;
        // if(node.left != null){
        // queue.offer(node.left);
        // }
        // if(node.right != null){
        // queue.offer(node.right);
        // }
        // }

        // res.add(sum / length);

        // }
        // return res;

        List<Integer> counts = new ArrayList<>();
        List<Double> sums = new ArrayList<>();
        List<Double> res = new ArrayList<>();

        dfs(root, 0, counts, sums);

        for(int i = 0; i < sums.size(); i++){
            res.add(sums.get(i) / counts.get(i));
        }

        return res;

    }

    public void dfs(TreeNode root, int level, List<Integer> counts, List<Double> sums) {
        if (root == null) {
            return;
        }

        if (level < sums.size()) {
            sums.set(level, sums.get(level) + root.val);
            counts.set(level, counts.get(level) + 1);
        } else {
            sums.add(1.0 * root.val);
            counts.add(1);
        }

        dfs(root.left, level + 1, counts, sums);
        dfs(root.right, level + 1, counts, sums);
    }
}
// @lc code=end
