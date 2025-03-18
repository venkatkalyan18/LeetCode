class Solution {
    public int longestNiceSubarray(int[] nums) {
        int res = 0;
        int left = 0;
        int curr = 0;
        int n = nums.length;

        for(int right=0;right<n;right++){
            while((curr & nums[right]) != 0){
                curr = curr ^ nums[left];
                left++;
            }
            curr = curr | nums[right];
            res = Math.max(res,right - left +1);
        }

        return res;
    }
}