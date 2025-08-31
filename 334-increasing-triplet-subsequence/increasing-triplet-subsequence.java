class Solution {
    public boolean increasingTriplet(int[] nums) {
        int p1 = Integer.MAX_VALUE;
        int p2 = Integer.MAX_VALUE;
        int p3 = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(p1 >= nums[i]){
                p1 = nums[i];
            }else if(p2 >= nums[i]){
                p2 = nums[i];
            }else if(p3 < nums[i]){
                p3 = nums[i];
            }

            if(p1 != Integer.MAX_VALUE && p2 != Integer.MAX_VALUE && p3 != Integer.MIN_VALUE){
                return true;
            }
        }

        return false;
    }
}