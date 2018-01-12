/**
 * @Author: hyc
 * @Date:   2018-01-12T14:29:13+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-12T14:29:23+08:00
 */

 class Solution {
     public int leastInterval(char[] tasks, int n) {
         int[] alpNum = new int[26];
         for(int task : tasks){
             alpNum[task -'A']++;
         }
         Arrays.sort(alpNum);
         int maxNum = 1;
         for(int i = 24; alpNum[i] == alpNum[25]; i--){
             maxNum++;
         }
         return Math.max(tasks.length, (alpNum[25] -1)  * (n + 1) + maxNum);
     }
 }
