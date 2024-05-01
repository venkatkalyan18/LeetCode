class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int pairs = 0;
        int l = 0;
        int r = nums.length - 1;
        while(l<r){
            if(nums[l]+nums[r] == k){
                pairs++;
                l++;
                r--;
            }else if(nums[l] + nums[r] < k){
                l++;
            }else{
                r--;
            }
        }
        return pairs;
    }
}