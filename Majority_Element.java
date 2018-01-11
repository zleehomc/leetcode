/**
 * @Author: hyc
 * @Date:   2018-01-10T19:00:41+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-11T09:37:21+08:00
 */
//摩尔投票法
 public class Solution {
     public int majorityElement(int[] nums) {
         int res = 0, cnt = 0;
         for (int num : nums) {
             if (cnt == 0) {res = num; ++cnt;}
             else if (num == res) ++cnt;
             else --cnt;
         }
         return res;
     }
 }

//位运算
 class Solution {
     public int majorityElement(int[] nums) {
         int res = 0;
         for(int i = 0; i < 32; i++){
             int ones = 0;
             int zeros = 0;
             for(int num : nums){
                 if((num & (1<<i)) != 0) ones++;
                 else zeros++;
             }
             if(ones > zeros){
                 res |= (1<<i);
             }
         }
         return res;
     }
 }
