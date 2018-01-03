class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length <3 || nums == null) return 0;
        Arrays.sort(nums);
        int TumClosest = Integer.MAX_VALUE;
        int len = nums.length;
        int ret = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i<len - 2; i++ ){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = len - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > target){
                    if((sum - target) < TumClosest){
                        TumClosest = sum - target;
                        ret = sum;
                    }
                    r--;
                }else if(sum < target){
                    if((target -sum ) < TumClosest){
                        TumClosest = target - sum;
                        ret = sum;
                    }
                    l++;
                }else{
                    return sum;
                }
            }
        }
        return ret;
    }
}
