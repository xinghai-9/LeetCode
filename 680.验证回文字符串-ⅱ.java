/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int front = 0;
        int rear = s.length() -1;
        while(front < rear){
            if(s.charAt(front) != s.charAt(rear)){
                return isValid(s, front + 1, rear) || isValid(s, front, rear - 1);
            }
            front ++;
            rear --;
        }

        return true;
    }

    public boolean isValid(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
// @lc code=end

