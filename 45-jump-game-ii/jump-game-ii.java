class Solution {
    public int jump(int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int count = 0;

        while(r < n - 1){
            int fartest = 0;
            for(int i = l;i<=r;i++){
                fartest = Math.max(fartest,i+nums[i]);
            }
            count ++;
            l = r + 1;
            r = fartest;
        }

        return count;
    }
}