/*
 * @lc app=leetcode.cn id=744 lang=java
 *
 * [744] 寻找比目标字母大的最小字母
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;

        while(left < right){
            int mid = (left + right) >>> 1;

            if(letters[mid] <= target) {
                left ++;
            }else{
                right = mid;
            }
        }

        return letters[left % letters.length];
    }
}
// @lc code=end

