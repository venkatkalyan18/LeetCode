class Solution {
    public int removeDuplicates(int[] nums) {
        int i=nums.length;

        if(nums.length==1){
            return 1;
        }
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1]){
                i=j;
    
                break;
            }
        }
       
      

        int j=i+1;
        while(j<nums.length){
            if(i>0 &&nums[j]!=nums[i] && nums[i-1]!=nums[j]){
                nums[i]=nums[j];
                i++;
                j++;
              
            }else{
                j++;
            }
           
        }

    return i;
    }
}