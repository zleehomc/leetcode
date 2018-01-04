class Solution {
    public int[] searchRange(int[] nums, int target) {
		int[] res = {-1, -1};
        if(nums.length == 0 || nums == null) return res;
		int begin = 0;
		int end = nums.length;
		while(begin < end){
			int mid = begin + (end - begin) / 2;
			if(nums[mid] < target) begin = mid + 1;
			else end = mid;
		}
        if(end <= nums.length-1){if(nums[end] != target) return res;}
        else return res;

		res[0] = end;
		end = nums.length;
		while(begin < end){
			int mid = begin + (end - begin) / 2;
			if(nums[mid] <= target) begin = mid + 1;
			else end = mid;
		}
		res[1] = end - 1;
        return res;
    }

}
