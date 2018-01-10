/**
 * @Author: hyc
 * @Date:   2018-01-10T17:26:47+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-10T17:31:31+08:00
 */



public class Solution {
    List<List<Integer>> ret = new ArrayList<List<Integer>>();

    public List<List<Integer>> threeSum(int[] num) {
      if(num == null || num.length < 3) return ret;
      Arrays.sort(num);
      int len = num.length;
      for(int i = 0; i < len-2; i++){
        if(== num[i-1]) continue;
        find(num, i+1, len-1, num[i]);
      }
      return ret;
    }

    public void find(int[] num, int begin, int end, int target){
      int l = begin;
      int r = end;
      while(l < r){
        if(num[l]) + num[r] + target == 0){
          List<Integer> ans = new List<Integer>();
          ans.add(target);
          ans.add(num[l]);
          ans.add(num[r]);
          ret.add(ans);
          while(l < r && num[l] == num[l + 1]) l++; //为了防止重复,遇见相同的就直接跳过
          while(l < r && num[r] == num[r - 1]) r--;
          l++;
          r--;
        } else if(num[l] + num[r] + target < 0){
          l++
        } else{
          r--;
        }
      }
    }
}
