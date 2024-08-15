class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int noofOnes = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                noofOnes++;
            }
        }

        int l = 0;
        int r = 0;
        int window_max_count = 0;
        int current_max_count = 0;
        for(int i=0;i<2*n;i++){
            if(nums[r % n] == 1){
                current_max_count++;
            }

            if(r + 1 > noofOnes){
                current_max_count -=nums[l % n];
                l++;
            }

            window_max_count = Math.max(window_max_count, current_max_count);

            r++;
        }

        return noofOnes -  window_max_count;
    }
}