class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        Integer[] x = new Integer[nums.length];
        Integer[] y = new Integer[nums.length];
        int a = helper(nums,1,nums.length,x);
        int b = helper(nums,0,nums.length-1,y);
        return Math.max(a,b);
    }

    public int helper(int[] nums,int start,int end,Integer[] dp){
        if(start >= end){
            return 0;
        }
        if(dp[start] != null) return dp[start];
        int a = helper(nums,start+1,end,dp);
        int b = nums[start] + helper(nums,start+2,end,dp);
        return dp[start] = Math.max(a,b);
    }
}