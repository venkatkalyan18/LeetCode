class Solution {
    public int longestSubarray(int[] nums) {
        int maxLength = 0;
        int length = 0;
        int r=0;
        int l=0;
        int zeroCount = 0;
        int zeroIndex = -1;
        while(r<nums.length){
            if(nums[r] == 0){
                zeroCount++;
            }

            while(zeroCount > 1){
                if(nums[l] == 0){
                    zeroCount--;
                }
                l++;
            }
             
            maxLength = Math.max(maxLength,r-l);
            r++;
           
             
        }

        return maxLength;
    }
}