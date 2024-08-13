class Solution {
    public boolean canSortArray(int[] nums) {
        int[] bits = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<n;i++){
            bits[i] = Integer.bitCount(nums[i]);
        }

        for(int i=0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(nums[j] > nums[j+1] && bits[j] == bits[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        if(!isSorted(nums)){
            return false;
        }

        return true;
    }

    public boolean isSorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }

        return true;
    }
}