class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int posMaxi = Integer.MIN_VALUE;
        int negMaxi = Integer.MAX_VALUE;
        int currPos = 0;
        int currNeg = 0;
        for(int i=0;i<nums.length;i++){
            currPos += nums[i];
            currNeg += nums[i];

            posMaxi = Math.max(posMaxi,currPos);
            negMaxi = Math.min(negMaxi,currNeg);

            if(currPos < 0){
                currPos = 0;
            }

            if(currNeg > 0){
                currNeg = 0;
            }
        }

        if(posMaxi > -negMaxi){
            return posMaxi;
        }

        return -negMaxi;
    }
}