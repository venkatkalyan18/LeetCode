class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = nums[n-1];
        int res = Integer.MAX_VALUE;

        while(left <= right){
            int mid = left + (right - left) / 2;
            int pairs = 0;

            for(int i =0;i<n-1;i++){
                if(nums[i+1] - nums[i] <= mid){
                    pairs++;
                    i++;
                }
            }

            if(pairs >= p){
                res = Math.min(mid,res);
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return res;
    }
}