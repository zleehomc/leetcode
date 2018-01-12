/**
 * @Author: hyc
 * @Date:   2018-01-12T14:28:43+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-12T14:28:56+08:00
 */

 class Solution {
     public int findUnsortedSubarray(int[] nums) {
         int len = nums.length;
         int max = nums[0];
         int min = nums[len - 1];
         int end = -2, start = -1;
         for(int i = 1;i < len; i++){
             max = Math.max(nums[i], max);
             if(max > nums[i]) end = i;

             min = Math.min(nums[len - 1 - i], min);
             if(min < nums[len - 1 - i]) start = len - 1 - i;
         }
         return end - start + 1;
     }
 }
