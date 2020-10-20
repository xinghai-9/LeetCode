import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {

    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        dfs(root,list);

        int left = 0;
        int right = list.size() - 1;
        for(int i = 0; i < list.size(); i++){
            int currentSum = list.get(left) + list.get(right);
            if(currentSum < k){
                left ++;
            }else if(currentSum > k){
                right --;
            }else if(left == right){
                return false;
            }else{
                return true;
            }
        }
   
        return false;
    }   

    // public boolean dfs(TreeNode root,Set<Integer> hashset, int k) {
    //     if (root == null) {
    //         return false;
    //     }
    //     if (hashset.contains(k - root.val)) {
    //         return true;
    //     }
    //     hashset.add(root.val);
    //     return dfs(root.left,hashset, k) || dfs(root.right,hashset, k);
        
    // }

    public void dfs(TreeNode root,List<Integer> list){
        if(root != null){
            dfs(root.left,list);
            if(!list.contains(root.val)){
                list.add(root.val);
            }
            dfs(root.right,list);
        }
    }
}
// @lc code=end
