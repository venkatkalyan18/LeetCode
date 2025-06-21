class Solution {
    public int solve(int []ch,int i,int j,int k,int dp[][]){
        if(i==j || ch[j]-ch[i]<=k) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=Math.min(ch[i]+solve(ch,i+1,j,k,dp), ch[j]-ch[i]-k+solve(ch,i,j-1,k,dp));
    }
    public int minimumDeletions(String w, int k) {
        
        int ch[] = new int[26];
        for (char c : w.toCharArray()) {
            ch[c - 'a']++;
        }
        
        Arrays.sort(ch);
        int dp[][]=new int[26][26];
        for(int row[]: dp) Arrays.fill(row,-1);
        return solve(ch,0,25,k,dp);
    }
}