/**
 * @Author: hyc
 * @Date:   2018-01-08T18:55:17+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-08T19:11:18+08:00
 * http://chuansong.me/n/390896436960
 */



class Solution {
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
