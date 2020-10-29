import java.util.Stack;

/*
 * @lc app=leetcode.cn id=682 lang=java
 *
 * [682] 棒球比赛
 */

// @lc code=start
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for(String elem : ops){
            if(elem.equals("+")){
                int tmp1 = stack.pop(); 
                int tmp2 = stack.peek(); 
                stack.push(tmp1);
                stack.push(tmp1 + tmp2);
            }else if(elem.equals("D")){

                stack.push(stack.peek() * 2);
            }else if(elem.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.valueOf(elem));
            }
        }

        int res = 0;
        for(int i : stack){
            res +=i;
        }

        return res;
    }
}
// @lc code=end
