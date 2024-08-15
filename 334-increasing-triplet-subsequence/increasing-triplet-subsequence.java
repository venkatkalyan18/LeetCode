class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for(int i : nums){
            if(i <= a){
                a = i;
            }else if(i <= b){
                b = i;
            }else{
                return true;
            }
        }

        return false;
    }
}