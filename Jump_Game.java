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
