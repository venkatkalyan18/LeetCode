class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,0,target,ans,new ArrayList<>());
        return ans;
    }

    public void helper(int[] arr,int i,int target,List<List<Integer>> ans,List<Integer> list){
        if(i == arr.length){
            return;
        }

        if(target == 0){
             ans.add(new ArrayList<>(list));
             return;
        }

        if(target < 0){
            return;
        }

        list.add(arr[i]);
        helper(arr,i,target - arr[i],ans,list);
        list.remove(list.size()-1);
        helper(arr,i+1,target,ans,list);
    }
}