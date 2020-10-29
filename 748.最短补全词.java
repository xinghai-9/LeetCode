import java.util.TreeSet;

/*
 * @lc app=leetcode.cn id=748 lang=java
 *
 * [748] 最短补全词
 */

// @lc code=start
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        char[] arr =  licensePlate.replaceAll("\\d| ", "").toLowerCase().toCharArray(); //清洗licensePlate
        //补全词排序
        TreeSet<String> set = new TreeSet<>((o1, o2) -> o1.length() != o2.length() ? o1.length() - o2.length() : 1);
        
        for(String word : words) { //查找补全词
            boolean flag = true;
            String copyWord = word;
            for(int i = 0; i < arr.length; i++) {
                if(copyWord.indexOf(arr[i]) < 0) {
                    flag = false;
                }else{
                    copyWord =  copyWord.replaceFirst(arr[i] + "", "#");
                }
            }
            if(flag){
                set.add(word);
            }
        }

        return set.first(); //返回最短补全词
    }
}
// @lc code=end

