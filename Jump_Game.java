/**
 * @Author: hyc
 * @Date:   2018-01-05T15:54:25+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-10T17:09:09+08:00
 */



class Solution {
    public boolean canJump(int[] nums) {
		int max = 0;
		for(int i = 0;i < nums.length - 1;i++){
			if(max < i-1 || max >= (n -1)){
				break;
			}
			max = Math.max(max , nums[i] + i);
		}
		return max >= (numsl.length - 1);
    }
}
