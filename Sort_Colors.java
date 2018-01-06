class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
		int red = 0;
		int blue = len -1;
		for(int i = 0; i < len; i++){
			if(nums[i] ==0){
				int temp = nums[i];
				nums[i] = nums[red];
				nums[red] = temp;
				red++;
			}
			if(nums[i] == 1){
				int temp = nums[i];
				nums[i] = nums[blue];
				nums[blue] = temp;
				blue--;
			}
		}
    }
}
