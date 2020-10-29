/*
 * @lc app=leetcode.cn id=696 lang=java
 *
 * [696] 计数二进制子串
 */

// @lc code=start
class Solution {
    public int countBinarySubstrings(String s) {
        int last = 0;
        int res = 0;
        int cur = 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)){
                cur++;
            }else{
                last = cur;
                cur = 1;
            }

            if(last >= cur){
                res++;
            }
        }

        return res;
    }
}
// @lc code=end

