class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
		if(len <= 1) return;
        int i = len - 1;
		while(i > 0 && nums[i] <= nums[i -1])
			i--;
		if(i == 0){
            reverse(nums, 0, len-1);
            return;
        }
		int j = len -1;
		while(nums[j] <= nums[i-1]) j--;
		swap(nums, j, i-1);
        reverse(nums, i, len-1);
	}
	private void swap(int[] num, int i, int j){
        int tmp;
		tmp = num[i];
		num[i] = num[j];
		num[j] = tmp;
    }
    private void reverse(int[] num, int i, int j){
	    while(i < j)
			swap(num, i++, j--);
    }
	public static void main(String[] args) {
		int nums[] = {1, 3, 2};
		Solution s = new Solution();
		s.nextPermutation(nums);
		System.out.print(nums[0] + " " + nums[1] +" "+ nums[2]);
	}

}
