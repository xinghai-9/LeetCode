/*
 * @lc app=leetcode.cn id=720 lang=java
 *
 * [720] 词典中最长的单词
 */

// @lc code=start
class Solution {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<String>();
        for(String word: words) {
            set.add(word);
        }
        
        //Arrays.sort(stringArray,(a,b)->{return  -a.compareTo(b);});
        Arrays.sort(words,(a,b) -> {
            return a.length() != b.length() ? b.length() - a.length() : a.compareTo(b);
        });

        for(String word : words) {
            int length = word.length();
            while(length > 0) {
                if(!set.contains(word.substring(0, length))) {
                    break;
                }
                length--;
            }

            if(length == 0) {
                return word;
            }
        }

        return "";
    }
}
// @lc code=end
