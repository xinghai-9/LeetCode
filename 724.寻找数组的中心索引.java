/*
 * @lc app=leetcode.cn id=724 lang=java
 *
 * [724] 寻找数组的中心索引
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        // int[] leftSum = nums.clone();
        // int[] rightSum = nums.clone();

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        // if(nums[0] == sum) {
        //     return 0;
        // }

        // if(nums[nums.length-1] == sum){
        //     return nums.length-1;
        // }

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                if(nums[0] == sum){
                    return 0;
                }
                continue;
            }

            nums[i] = nums[i] + nums[i - 1];

            if(nums[i - 1] == sum - nums[i]){
                // System.out.println("hi");
                return i;
            }

            if((i == nums.length-2) && nums[nums.length - 1] == sum){
                return nums.length - 1;
            }
        }

        // for(int i = 1,j = rightSum.length - 2; i < leftSum.length; i++,j--) {
        //     leftSum[i] = leftSum[i] + leftSum[i - 1];
        //     rightSum[j] = rightSum[j] + rightSum[j + 1]; 
        // }

        // for(int i = 0; i < leftSum.length; i++){
        //     if(leftSum[i] == rightSum[i]){
        //         return i;
        //     }
        // }

        return -1;
    }
}
// @lc code=end

