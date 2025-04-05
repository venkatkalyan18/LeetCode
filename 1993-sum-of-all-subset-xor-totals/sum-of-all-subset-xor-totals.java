class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }

    public int helper(int[] nums, int val,int i){
        if(i >= nums.length){
            return 0;
        }
       return (val ^ nums[i]) +  helper(nums,val ^ nums[i],i+1) + helper(nums,val,i+1);
    }
}