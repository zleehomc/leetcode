class Solution {
    public int trap(int[] height) {
		int mx = 0;
		int res = 0;
		int[] dp = new int[height.length];
		for(int i = 0; i < height.length; i++){
			dp[i] = mx;
			mx = Math.max(mx, height[i]);
		}
		mx = 0;
		for(int i = height.length - 1; i >= 0; i--){
			dp[i] = Math.min(mx, dp[i]);
			mx = Math.max(mx, height[i]);
			if(dp[i] > height[i]){
				res += dp[i] - height[i];
			}
		}
        return res;
    }
}
class Solution {
    public int trap(int[] height) {
		int begin = 0;
		int end = height.length - 1;
		int res = 0;
		while(begin < end){
			int min = Math.min(height[begin], height[end]);
			if(height[begin] == min){
				begin++;
				while(height[begin] < min){
					res += min - height[begin];
					begin++;
				}
			}else{
				end--;
				while(height[end] < min){
					res = min - height[end];
					end--;
				}
			}
		}
		return res;
	}
}
