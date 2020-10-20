/*
 * @lc app=leetcode.cn id=661 lang=java
 *
 * [661] 图片平滑器
 */

// @lc code=start
class Solution {
    public int[][] imageSmoother(int[][] M) {
        int R = M.length;
        int C = M[0].length;
        int[][] res = new int[R][C];

        for(int r = 0; r < R; r++){
            for(int c = 0; c < C; c++){
                int count = 0;
                int currentSum = 0;
                for(int nr = r - 1; nr <= r + 1; nr ++){
                    for(int nc = c - 1; nc <= c + 1; nc++){
                        if(0 <= nr && nr < R && 0 <= nc && nc < C){
                            currentSum += M[nr][nc];
                            count++;
                        }
                    }
                }
                res[r][c] = currentSum / count;
            }
        }

        return res;
    }
}
// @lc code=end

