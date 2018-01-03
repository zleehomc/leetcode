class Solution {
    public void nextPermutation(int[] nums) {
        val len = nums.length;
		if(len <= 1) return;
		while(i > 0 && nums[i] <= nums[i -1])
			i--;
		if(i == 0)
			Collections.reverse(nums);
		int j = len -1;
		while(nums[j] > nums[i-1]) j--;

		Collections.swap(nums, j, i-1);
		Arrays.sort(nums, i, len)
		}
}
