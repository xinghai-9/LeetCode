import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=448 lang=java
 *
 * [448] 找到所有数组中消失的数字
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int item : nums){
            nums[Math.abs(item) - 1] = -Math.abs(nums[Math.abs(item) - 1]);
        }

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>0){
                res.add(i + 1);
            }
        }
        return res;
    }
}
// @lc code=end
