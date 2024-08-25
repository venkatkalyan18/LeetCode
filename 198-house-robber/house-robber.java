class Solution {
    public int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        return solve(nums,0,dp);
    }

    public int solve(int[] nums,int i,Integer[] dp){
        if(i >= nums.length){
            return 0;
        }

        if(dp[i] != null) return dp[i];
        int curr = nums[i];
        int a  = solve(nums,i+1,dp);
        int b = curr + solve(nums,i+2,dp);
        return dp[i] = Math.max(a,b);


    }
}