class Solution {
    public int jump(int[] nums) {
        int jumps = 0,right =0,left=0;
        while(right < nums.length-1 ){
            int fartest = 0;
            for(int i=left;i<=right;i++){
                fartest = Math.max(fartest,i+nums[i]);
            }

            left = right+1;
            right = fartest;
            jumps++;
        }

        return jumps;
    }
}