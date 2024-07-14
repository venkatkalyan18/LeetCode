class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,0,target,ans,new ArrayList<>());
        return ans;
    }

    public void helper(int[] arr,int i,int target,List<List<Integer>> ans, List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int j = i;j<arr.length;j++){
            if(j > i && arr[j] == arr[j-1]) continue;

            if(target < arr[j]){
                break;
            }

            list.add(arr[j]);
            helper(arr,j+1,target - arr[j],ans,list);
            list.remove(list.size()-1);
        }
    }
}