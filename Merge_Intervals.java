/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 **/
class Solution {
	public class MyCompartor implements Comparator<Interval>{
		@Override
		public int compare(Interval a, Interval b){
			return a.start - b.start;
		}
	}

    public List<Interval> merge(List<Interval> intervals) {
		List<Interval> ans = new ArrayList<Interval>();
		if(ans.size() == 0){
			return ans;
		}
		Collections.sort(intervals, new MyCompartor());
		res.add(intervals[0]);
 		for(int i = 1; i < intervals.size(); i++){
			if(res[res.size()-1].end < intervals[i].start -1){
				res.add(intervals[i]);
			}else{
				res[res.size()-1].end = Math.max(res[res.size()-1].end, intervals[i].end);
			}
		}

    }
}
