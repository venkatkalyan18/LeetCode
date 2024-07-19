class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int ans = nums.length;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] >= target){
                ans = mid;
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

}