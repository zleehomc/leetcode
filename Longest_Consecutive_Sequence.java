/**
 * @Author: hyc
 * @Date:   2018-01-10T14:43:43+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-10T14:43:56+08:00
 */

 class Solution {
     public int longestConsecutive(int[] nums) {
         int max = 0;
         if(nums == null || nums.length == 0){
             return 0;
         }
         Set<Integer> s = new HashSet<>();
         for(int num: nums) s.add(num);
         for(int num: nums){
             if(s.remove(num)){
                 int pre = num - 1;
                 int next = num + 1;
                 while(s.remove(pre)) pre--;
                 while(s.remove(next)) next++;
                 max = Math.max(max, next - pre - 1);
             }
         }
         return max;
     }
 }
