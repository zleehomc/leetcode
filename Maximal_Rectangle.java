/**
 * @Author: hyc
 * @Date:   2018-01-08T20:19:17+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-08T20:19:31+08:00
 */

 class Solution {
     public int maximalRectangle(char[][] matrix) {
         int res = 0;
         if(matrix.length == 0) return 0;
         int n = matrix.length;
         int m = matrix[0].length;
         int[] heights = new int[m];
         for(int i = 0 ;i< n ;i++){
             for(int j = 0;j< m;j++){
                 heights[j] = (matrix[i][j] == '1')? heights[j] + 1 : 0;
             }
             res = Math.max(res, largestRectangleArea(heights));
         }
         return res;
     }
         public int largestRectangleArea(int[] heights) {
         int max = 0;
         Stack<Integer> st = new Stack<Integer>();
         for(int i = 0;i <= heights.length; i++){
             int h = (i == heights.length ? 0 : heights[i]);
             if(st.size() == 0 || h >= heights[st.peek()]){
                 //System.out.println(i);
                 st.push(i);
             }else{
                 int index = st.pop();
                 int area =  heights[index] * (st.empty()?i:i - st.peek() - 1);
                 //System.out.println("area" + area);
                 max = Math.max(area, max);
                 i--;
             }
         }
         return max;
     }
 }
