/**
 * @Author: hyc
 * @Date:   2018-01-11T10:43:16+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-11T10:43:31+08:00
 */

 class Solution {
     public void moveZeroes(int[] nums) {
         for(int i = 0, j = 0;i< nums.length;i++){
             if(nums[i] != 0){
                 swap(nums, i, j++);
             }
         }
     }
     public void swap(int[] nums, int i, int j){
         int temp = nums[i];
         nums[i] = nums[j];
         nums[j] = temp;
     }
 }
