void moveZeroes(int* nums, int n) {
    int zeroIndex=0;
    for(int i=0;i<n;i++){
        if(nums[i]==0){
            zeroIndex=i;
            break;
        }
    }

    if(nums[zeroIndex]!=0){
        return;
    }

    for(int i=zeroIndex+1;i<n;i++){
        if(nums[i]!=0){
            nums[zeroIndex]=nums[i];
            nums[i]=0;
            zeroIndex++;
        }
    }
}