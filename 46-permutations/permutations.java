class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        helper(nums,new ArrayList<>(),ans,map);
        return ans;
    }

    public void helper(int[] nums,List<Integer> list, List<List<Integer>> ans,boolean[] map){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!map[i]){
                map[i] = true;
                list.add(nums[i]);
                helper(nums,list,ans,map);
                list.remove(list.size()-1);
                map[i] = false;
            }
        }
    }
}