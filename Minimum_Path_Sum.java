/**
 * @Author: hyc
 * @Date:   2018-02-27T11:11:41+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-02-27T11:11:58+08:00
 */

 class Solution {
     public int minPathSum(int[][] grid) {
         int m = grid.length;
         int n = grid[0].length;
         for(int i = 0 ; i < m ;i++){
             for(int j = 0; j < n ;j++){
                 if(i ==0 && j != 0){
                     grid[i][j] = grid[i][j] + grid[i][j-1];
                 }else if(i != 0 && j == 0){
                     grid[i][j] = grid[i][j] + grid[i-1][j];
                 }else if(i == 0 && 0 == j){
                     grid[i][j] = grid[i][j];
                 }else{
                     grid[i][j] = grid[i][j] + Math.min(grid[i][j-1], grid[i-1][j]);
                 }
             }
         }
         return grid[m-1][n-1];
     }
 }
