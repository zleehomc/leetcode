class Solution {
    public int search(int[] nums, int target) {
		return fun(nums, 0, nums.length-1, target);
    }
	public int fun(int[] nums, int begin , int end, int target){
		int mid = begin + (end -begin) / 2;
		if(begin > end) return -1;
		if(nums[mid] == target) return mid;

		if(nums[begin] < nums[mid]){
			if(target > nums[begin] && target < nums[end]){
				return fun(nums, begin, mid - 1, target);
			}else{
				return fun(nums, mid+1, end, target);
			}
		}else{
			if(target > nums[mid] && target < nums[end]){
				return fun(nums, mid +1, end, target);
			}else{
				return fun(nums, begin, mid-1, target)
			}
		}
	}
}
