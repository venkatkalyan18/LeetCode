class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=9;i++){
            dfs(n,i,ans);
        }
        return ans;
    }

    public void dfs(int n,int curr,List<Integer> ans){
        if(curr > n){
            return;
        }
        ans.add(curr);
        for(int i=0;i<=9;i++){
            dfs(n,(curr*10) + i,ans);
        }
            
    }
}