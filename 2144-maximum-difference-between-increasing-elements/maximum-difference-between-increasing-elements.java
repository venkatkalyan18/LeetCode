class Solution {
    public int maximumDifference(int[] nums) {
        int i = 0;
        int res = -1;

        for(int j = 1;j<nums.length;j++){
            res = Math.max(res,nums[j] - nums[i]);
            if(nums[i] > nums[j]){
                i = j;
            }
        }
        if(res == 0){
            res = -1;
        }
        return res;
    }
}