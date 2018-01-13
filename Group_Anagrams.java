/**
 * @Author: hyc
 * @Date:   2018-01-13T17:09:08+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-13T17:09:16+08:00
 */


 class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {
         if(strs == null || strs.length == 0) return new ArrayList<>();
         List<List<String>> res = new ArrayList<>();
         Map<String, List<String>> m = new HashMap<>();
         for(String str : strs){
             int[] t = new int[26];
             String s = "";
             for(int i = 0; i < str.length(); i++)
                 t[str.charAt(i) - 'a']++;
             for(int j = 0; j < 26 ;j++)
                 s += String.valueOf(t[j]) + "/";
             if(!m.containsKey(s)) m.put(s, new ArrayList<>());
             m.get(s).add(str);
         }
         for(String key : m.keySet()){
             res.add(m.get(key));
         }
         return res;
     }
 }
