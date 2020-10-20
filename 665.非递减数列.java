/*
 * @lc app=leetcode.cn id=665 lang=java
 *
 * [665] 非递减数列
 */

// @lc code=start
class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int count = 0;
        for(int i = 0; i <= nums.length - 3; i++){
            if(i - 1 >= 0 && nums[i - 1] > nums[i + 1] && nums[i] > nums[i + 2]){
                return false;
            }
            if(nums[i] > nums[i + 1]){
                count ++;
            }
        }

        if(nums[nums.length - 2] > nums[nums.length - 1]){
            count ++;
        }

        return count <= 1? true : false;
    }
}
// @lc code=end

