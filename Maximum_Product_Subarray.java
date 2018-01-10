/**
 * @Author: hyc
 * @Date:   2018-01-10T16:47:53+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-10T16:47:59+08:00
 */
 class Solution {
     public int maxProduct(int[] nums) {
         int max = nums[0];
         int res = nums[0];
         int min = nums[0];
         for(int i = 1 ;i < nums.length; i++){
             int max_copy = max;
             max = Math.max(Math.max(nums[i], max * nums[i]), min * nums[i]);
             min = Math.min(nums[i], max_copy * nums[i]);
             res = Math.max(max, res);
         }
         return res;

     }
 }
