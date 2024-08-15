class Solution {
    public boolean canJump(int[] nums) {
        int maxDistance = 0;
        for(int i=0;i<nums.length;i++){
            if(i > maxDistance){
                return false;
            }

            maxDistance = Math.max(maxDistance,nums[i] + i);
        }

        return true;
    }
}