/**
 * @Author: hyc
 * @Date:   2018-01-11T17:34:37+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-11T18:49:29+08:00
 * https://www.cnblogs.com/hiddenfox/p/3408931.html
 */

 class Solution {
     public int findDuplicate(int[] nums) {
         if (nums == null || nums.length < 2) return 0;
         int i = nums[0];
         int j = nums[nums[0]];
         while(nums[i] != nums[j]){ //可以判断为i != j
             i = nums[i];
             j = nums[nums[j]];
         }
         j = 0;
         while(nums[i] != nums[j]){ //此处若为i != j的话 返回i或者j
             i = nums[i];
             j = nums[j];
         }
         return nums[i];
     }
 }
