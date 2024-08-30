class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }

    public int helper(int[] nums,int target,int i,int curr){ // 1 for positive and 0 for negative
        if(i == nums.length){
            if(target == curr){
                return 1;
            }
            return 0;
        }

        return helper(nums,target,i+1,curr+nums[i]) + helper(nums,target,i+1,curr-nums[i]);
    
    }
}