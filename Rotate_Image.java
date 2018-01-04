class Solution {
    public void rotate(int[][] matrix) {
    	int len = matrix[0].length;
		int wid = matrix.length;
		for(int i = 0; i < len; i++){
			for(int j = 0; j < wid; j++){
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			}
			int left = 0;
			int right = wid;
			while(left< right){
				int temp = matrix[i][left];
				matrix[i][eft] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
			}

		}
    }
}
