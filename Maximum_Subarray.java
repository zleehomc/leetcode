// Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
// For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
// the contiguous subarray [4,-1,2,1] has the largest sum = 6.
class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE, sum = 0;
        for(int num :nums){
            sum = Math.max(sum+num, num);//引入新的num之后,看新的num和之前的最大组合之后是不是减小了,如果减小了就直接用新引入的
            res = Math.max(sum, res);//在流程的过程中会出现最大值
        }
        return res;
    }
}
