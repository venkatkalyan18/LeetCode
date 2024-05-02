class Solution {
    public double findMaxAverage(int[] nums, int k) {
        

        double sum = 0;
        double ans = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i=0;i<k;i++){
            sum = sum + nums[i];
        }
        ans = sum/k;
        for(int i = k;i<nums.length;i++){
            
            sum = sum - nums[i-k] + nums[i];
            if(sum / k > ans){
                ans = sum/k;
            }
            
        }
        return ans;
        
    }
}