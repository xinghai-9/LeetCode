/*
 * @lc app=leetcode.cn id=645 lang=java
 *
 * [645] 错误的集合
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] tmp = new int[10001];
        for(int i = 0; i < nums.length; i++){
            tmp[nums[i]] ++; 
        }
        int[] res = new int[2];
        for(int i = 1; i <= nums.length; i++){
            System.out.println(tmp[i]);
            if(tmp[i] > 1){
                res[0] = i;
            }

            if(tmp[i] == 0){
                res[1] = i; 
            }
        }
        return res;
    }
}
// @lc code=end

