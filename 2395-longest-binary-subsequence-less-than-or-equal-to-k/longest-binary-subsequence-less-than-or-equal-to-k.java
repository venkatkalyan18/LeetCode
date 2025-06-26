class Solution {
    public int longestSubsequence(String s, int k) {
        Integer[][] dp = new Integer[s.length()][s.length()];
        return helper(s,k,0,0,s.length()-1,s.length()-1,dp);
    }

    public int helper(String s,int k,int currSum,int size,int i,int n,Integer[][] dp){
        if(i < 0){
            return 0;
        }
        if(dp[i][size] != null){
            return dp[i][size];
        }
        int take = 0;
        int notTake = 0;
        if(s.charAt(i) == '0'){
            take = 1 + helper(s,k,currSum,size+1,i-1,n,dp);
        }else{
            int val = (int) Math.pow(2,n-i);
            if((long) currSum + val <= (long) k){
                take = 1 + helper(s,k,currSum+val,size+1,i-1,n,dp);
            }
        }  

        if(s.charAt(i) == '1'){
            notTake = helper(s,k,currSum,size+1,i-1,n,dp);
        }
        return dp[i][size] = Math.max(take,notTake);
    }
}
