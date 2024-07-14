class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans,new ArrayList<>());
        return ans;
    }

    public void helper(int[] arr,int i,List<List<Integer>> ans,List<Integer> list){
        if(i == arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int j = 0;j<=list.size();j++){
            list.add(j,arr[i]);
            helper(arr,i+1,ans,list);
            list.remove(j);
        }
    }


}