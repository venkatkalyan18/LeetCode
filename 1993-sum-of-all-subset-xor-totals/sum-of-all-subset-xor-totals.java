class Solution {
    public int subsetXORSum(int[] nums) {
        int[] res = new int[1];
        helper(nums,0,0,res);
        return res[0];
    }

    public void helper(int[] nums, int val,int i,int[] sum){
        if(i >= nums.length){
            return;
        }

        sum[0] += val ^ nums[i];
        helper(nums,val ^ nums[i],i+1,sum);
        helper(nums,val,i+1,sum);

    }
}