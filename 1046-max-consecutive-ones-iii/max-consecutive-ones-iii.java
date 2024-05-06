class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0;
        int l = 0;
        int r = 0;
        int zerosCount = 0;
        while(r<nums.length){
            if(nums[r] == 0) zerosCount++;

            while(l<nums.length && zerosCount > k){
                if(nums[l] == 0){
                    zerosCount--;
                }
                l++;
            }
            maxLength = Math.max(maxLength, r-l+1);
            r++;
        }

        return maxLength;
    }
}