/**
 * @Author: hyc
 * @Date:   2018-01-11T10:23:11+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-11T10:43:54+08:00
 */


 class Solution {
     public int[] productExceptSelf(int[] nums) {
         int len = nums.length;
         int right = 1;
         int[] res = new int[len];
         res[0] = 1;
         for(int i = 1; i < len ; i++){
             res[i] = res[i - 1] * nums[i - 1];
         }
         for(int i = len-1 ;i>=0;i--){
             res[i] = res[i] * right;
             right = right * nums[i];
         }
         return res;
     }
 }
