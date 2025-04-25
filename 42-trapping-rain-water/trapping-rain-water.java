class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] sufix = new int[n];
        int[] prefix = new int[n];

        int curr = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            curr = Math.max(curr,height[i]);
            prefix[i] = curr;
        }

        curr = Integer.MIN_VALUE;
        for(int i = n-1;i>=0;i--){
            curr = Math.max(curr,height[i]);
            sufix[i] = curr;
        }

        int res = 0;
        for(int i =0;i<n;i++){
            res = res + Math.abs(height[i] - Math.min(sufix[i] , prefix[i]));
        }

        return res;
    }
}