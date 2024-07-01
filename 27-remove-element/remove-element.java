class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0 ){
            return 0;
        }
        int i = 0;
        int num = 0;
        while(i<nums.length && nums[i] != val){
            i++;
        }



        if(i == nums.length){
            return nums.length;
        }

        for(int j = i+1 ;j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}