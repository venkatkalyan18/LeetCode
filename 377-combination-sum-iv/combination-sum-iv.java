class Solution {
    public int combinationSum4(int[] nums, int target) {
Integer[] dp = new Integer[2000];
        return helper(nums, target,dp);
    }

    public int helper(int[] nums, int target,Integer[] dp) {
        if (target == 0) return 1;
        if (target <  0) return 0;
        if(dp[target] != null) return dp[target];

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += helper(nums, target - nums[i],dp);
        }

        return dp[target] = result;
    }
}
