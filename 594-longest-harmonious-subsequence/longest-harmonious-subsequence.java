class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int left = 0;
        for(int right=1;right<nums.length;right++){
            if(nums[left] == nums[right]) continue;
            while(left < right && nums[right] - nums[left] != 1){
                left++;
            }
            res = Math.max(res,right-left+1);
        }
        return res == 1 ? 0 : res;
    }
}