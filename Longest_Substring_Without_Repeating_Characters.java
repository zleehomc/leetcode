/**
 * @Author: hyc
 * @Date:   2018-01-13T14:31:46+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-13T14:31:55+08:00
 */


 class Solution {
     public int lengthOfLongestSubstring(String s) {
         int left = 0;
         int res = 0;
         Map<Character, Integer> m = new HashMap<>();
         for(int i = 0; i < s.length();i++){
             if(m.getOrDefault(s.charAt(i), 0) == 0 || m.get(s.charAt(i)) <= left){
                 res = Math.max(res, i - left + 1);
             }else{
                 left = m.get(s.charAt(i));
             }
             m.put(s.charAt(i), i + 1);
         }
         return res;
     }
 }
