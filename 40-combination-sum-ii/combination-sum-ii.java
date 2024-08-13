class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,new ArrayList<>(),ans,0);
        return ans;
    }

    public void helper(int[] candidates,int target,List<Integer> p,List<List<Integer>> ans,int k){
        if(target == 0){
            ans.add(new ArrayList<>(p));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i=k;i<candidates.length;i++){
            if(i > k && candidates[i] == candidates[i-1]){
                continue;
            }
            p.add(candidates[i]);
            helper(candidates,target - candidates[i],p,ans,i+1);
            p.remove(p.size()-1);
        }
    }
}