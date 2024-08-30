class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0);
    }

    public int helper(int[] nums,int target,int i){ // 1 for positive and 0 for negative
        if(i == nums.length){
            if(target == 0){
                return 1;
            }
            return 0;
        }

        return helper(nums,target+nums[i],i+1) + helper(nums,target-nums[i],i+1);
    
    }
}