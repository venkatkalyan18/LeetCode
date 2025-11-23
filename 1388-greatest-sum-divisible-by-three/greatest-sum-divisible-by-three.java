class Solution {
    public int maxSumDivThree(int[] nums) {
        int[][] dp = new int[nums.length+1][3];
        dp[0][1] = Integer.MIN_VALUE;
        dp[0][2] = Integer.MIN_VALUE;
        
        for(int i=1;i<=nums.length;i++){
            for(int j=0;j<3;j++){
                int take = nums[i-1] + dp[i-1][(j + nums[i-1]) % 3];
                int notTake = dp[i-1][j];
                dp[i][j] = Math.max(take,notTake);
            }
        }
        return dp[nums.length][0];
    }

    public int helper(int[] nums,int i,int rem,Integer[][] dp){
        if(i < 0){
            return rem == 0 ? 0 : Integer.MIN_VALUE;
        }

        if(dp[i][rem] != null){
            return dp[i][rem];
        }

        int take = nums[i] + helper(nums,i-1,(rem + nums[i]) % 3,dp);
        int notTake = helper(nums,i-1,rem,dp);
        return dp[i][rem] = Math.max(take,notTake);
    }
}