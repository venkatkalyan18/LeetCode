class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        helper(1,list,new ArrayList<>(),k,n);
        return list;
    }

    public void helper(int s,List<List<Integer>> ans,List<Integer> list,int k,int target){
        if(list.size() == k){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }

            return;
        }

        for(int i = s;i<=9;i++){
            if(i > target) break;
            list.add(i);
            helper(i+1,ans,list,k,target - i);
            list.remove(list.size()-1);
        }
    }
}