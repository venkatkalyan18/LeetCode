/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    *returnSize=2;
    int * res;
    res=malloc(sizeof(int)*2);
    for(int i=0;i<numsSize;i++){
        for(int j=i+1;j<numsSize;j++){
            int sum=nums[i]+nums[j];
            if(sum==target){
                res[0]=i;
                res[1]=j;
                return res;
            }
        }
    }

    return -1;
}