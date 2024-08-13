class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];

        int l = 1;
        for(int i=0;i<nums.length;i++){
            l *= nums[i];
            ans[i] = l;
        }
        int r = 1;
        ans[ans.length-1] = ans[ans.length-2];
        for(int i = nums.length-1;i>=2;i--){
            r = r * nums[i];
            ans[i-1] = ans[i-2] * r;
        }

        r = r * nums[1];
        ans[0] = r;
        return ans;


    }
}