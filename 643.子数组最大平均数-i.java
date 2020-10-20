import java.util.Arrays;
import java.util.Collections;

/*
 * @lc app=leetcode.cn id=643 lang=java
 *
 * [643] 子数组最大平均数 I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int maxSum = Integer.MIN_VALUE;
        // for (int i = 0; i <= nums.length - k; i++) {
        // int currentSum = 0;
        // for (int j = i; j < i + k; j++) {
        // currentSum += nums[j];
        // }
        // if (currentSum > maxSum) {
        // maxSum = currentSum;
        // }
        // }
        // return maxSum * 1.0 / k;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return max * 1.0 / k;
    }
}
// @lc code=end
