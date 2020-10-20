/*
 * @lc app=leetcode.cn id=628 lang=java
 *
 * [628] 三个数的最大乘积
 */

// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        int positiveNumber = 0;
        int negativeNumber = 0;
        int lastIndex = nums.length - 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                positiveNumber++;
            }else{
                negativeNumber++;
            }
        }

        Arrays.sort(nums);

        if(negativeNumber == 0){
            return nums[lastIndex] * nums[lastIndex - 1] * nums[lastIndex - 2];
        }else if(positiveNumber == 0 || (negativeNumber == 1 && positiveNumber == 2) || (negativeNumber == 2 && positiveNumber == 1)){
            return nums[0] * nums[1] * nums[2];
        }else if(positiveNumber == 1 || positiveNumber == 2){
            return nums[0] * nums[1] * nums[lastIndex];
        }else if(negativeNumber == 1){
            return nums[lastIndex] * nums[lastIndex - 1] * nums[lastIndex - 2];
        }else{
            return nums[lastIndex] * Math.max(nums[0] * nums[1], nums[lastIndex - 1] * nums[lastIndex - 2]);
        }
        
    }
}
// @lc code=end
