class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroIndex=i;
                break;
            }
        }
        if(nums[zeroIndex]!=0){
            return;
        }

        for(int i=zeroIndex+1;i<nums.length;i++){
            if(nums[i]!=0){
                nums[zeroIndex]=nums[i];
                nums[i]=0;
                zeroIndex++;
            }
        }

 
    }
}