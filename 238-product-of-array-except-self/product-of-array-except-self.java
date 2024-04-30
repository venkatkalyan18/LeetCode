class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] postfixSum = new int[n];
        int[] prefixSum = new int[n];
        postfixSum[n-1] = nums[n-1];
        prefixSum[0] = nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] * nums[i];
            postfixSum[n-i-1] = postfixSum[n-i] * nums[n-i-1];
        }
        nums[n-1] = prefixSum[n-2];
        nums[0] = postfixSum[1];
        for(int i=1;i<n-1;i++){
            nums[i] = prefixSum[i-1] * postfixSum[i+1];
        }
        return nums;

    }
}