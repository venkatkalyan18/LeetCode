class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        int n =nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeroIndex = i;
                break;
            }
        }
        if(zeroIndex==-1){
            return;
        }
        for(int i = zeroIndex+1;i<n;i++){
            if(nums[i]!=0){
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
                zeroIndex++;
            }
        }
    }
}