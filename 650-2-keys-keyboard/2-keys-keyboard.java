class Solution {
    public int minSteps(int n) {
        
        if(n==1) return 0;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return 1+helper(n,1,1,dp);


    }

    int helper(int n,int curr,int copy,int[][] dp){

        if(curr==n) return 0;

        if(dp[curr][copy]!=-1) return dp[curr][copy];

        int paste=2000;
        if(curr+copy<=n){
            paste = 1+helper(n,curr+copy,copy,dp);
        }
        int copypaste=2000;
        if(curr*2<=n){
            copypaste = 2+helper(n,curr*2,curr,dp);
        }

        return dp[curr][copy] = Math.min(copypaste,paste);
        
    }
}