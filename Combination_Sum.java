class Solution {

	public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

			List<Integer> temp = new ArrayList<Integer>();
			Arrays.sort(candidates);
			int start = 0;

			find(candidates, start, target, temp);
        return res;
    }
	public void find(int[] candidates, int start,  int target, List<Integer> temp){
		if(target < 0) return ;
		else if(target == 0)  {res.add(temp); return;}
		else{
			for(int i = start; i < candidates.length; i++){
				temp.add(candidates[i]);
				find(candidates, i, target - candidates[i], temp);
				temp.remove(temp.size()-1);
			}
		}
	}
}
