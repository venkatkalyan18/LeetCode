class Solution {
    public int minOperations(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length - 2;i++){
            if(nums[i] == 1){
                continue;
            }

            nums[i] = 1;
            nums[i+1] = nums[i+1] ^ 1;
            nums[i+2] = nums[i+2] ^ 1;
            res++;
        }
        int n = nums.length - 1;
        if(nums[n] == 0 || nums[n-1] == 0 ){
            return -1;
        } 

        return res;
    }
}