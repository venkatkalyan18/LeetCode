class Solution {
    public int pivotIndex(int[] nums) {

        if(nums.length == 1){
            return 0;
        }
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int prefixSum = 0;
        int postfixSum =0;
        int ans = -1;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            postfixSum+=nums[n-i-1];

            prefix[i] = prefixSum;
            postfix[n-i-1] = postfixSum;
        }

        
         if(postfix[1] ==0){
            return 0;
        }

        for(int i=1;i<nums.length-1;i++){
            if(prefix[i-1] == postfix[i+1] ){
                return i;
            }
        }

       
        if(prefix[n-2] ==0){
            return n-1;
        }

        return -1;
    }
}