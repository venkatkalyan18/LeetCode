class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(1,n,ans,new ArrayList<>(),k);
        return ans;
    }

    public void helper(int s,int n,List<List<Integer>> ans,List<Integer> list,int k){
        if(list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=s;i<=n;i++){
            list.add(i);
            helper(i+1,n,ans,list,k);
            list.remove(list.size()-1);
        }
    }
}