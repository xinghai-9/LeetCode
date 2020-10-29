/*
 * @lc app=leetcode.cn id=693 lang=java
 *
 * [693] 交替位二进制数
 */

// @lc code=start
class Solution {
    public boolean hasAlternatingBits(int n) {
        return Integer.toString(n,2).indexOf("00") == -1 && Integer.toString(n,2).indexOf("11") == -1;
    }
}
// @lc code=end
