class Solution {
    public int minOperations(int[] nums, int k) {
       Arrays.sort(nums);
       int res = 0;
       int i = 0;
       while(i<nums.length){
            res++;
            int temp = nums[i];
            while(i < nums.length && temp == nums[i]){
                i++;
            }
       }

       
       if(nums[0] == k){
            return res-1;
       }

       if(nums[0] > k){
            return res;
       }

       return -1;
    }
}