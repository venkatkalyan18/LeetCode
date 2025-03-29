class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            currSum += nums[i];
            maxi = Math.max(maxi,currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }

        return maxi;

    }
}