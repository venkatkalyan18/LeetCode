class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length-1;
        while(mid <= right){
            if(nums[mid] == 2){
                nums[mid] = nums[right];
                nums[right--] = 2;
                continue;
            }if(nums[mid] == 0){
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
            }
            mid++;
        }
    }
}

