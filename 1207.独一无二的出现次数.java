import java.util.Map;

/*
 * @lc app=leetcode.cn id=1207 lang=java
 *
 * [1207] 独一无二的出现次数
 */

// @lc code=start
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int elem : arr){
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }

        Set<Integer> set = new HashSet<Integer>(map.values());

        if(set.size() != map.values().size()) {
            return false;
        }

        return true;
    }
}
// @lc code=end

