class Solution {
    public boolean canJump(int[] nums) {
        int maxLen = 0;
        for(int i = 0;i<nums.length;i++){
            if(maxLen < i){
                return false;
            }

            maxLen = Math.max(maxLen,i+nums[i]);
        }

        return true;
    }
}