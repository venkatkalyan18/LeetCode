class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        int maxi = Integer.MIN_VALUE;
        

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = maxi;
            maxi = Math.max(maxi, nums[i]);
        }

        int left = 0;
        long res = 0;  
        
        for (int i = 1; i < n - 1; i++) {
            long tripletValue = ((long) nums[left] - nums[i]) * suffix[i]; 
            res = Math.max(res, tripletValue);
            
            if (nums[left] < nums[i]) {
                left = i;
            }
        }
        
        return res;
    }
}
