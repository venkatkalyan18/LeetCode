class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans,new ArrayList<>());
        return ans;

    }

    public void helper(int[] nums,int i,List<List<Integer>> ans,List<Integer> list){
        if(i == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }


        list.add(nums[i]);
        helper(nums,i+1,ans,list);
        list.remove(list.size()-1);
        helper(nums,i+1,ans,list);
    }
}