class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int x = 0;
        int y = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                ans[x] = nums[i];
                x+=2;
            }else{
                ans[y] = nums[i];
                y+=2;
            }
        }

        return ans;
    }
}