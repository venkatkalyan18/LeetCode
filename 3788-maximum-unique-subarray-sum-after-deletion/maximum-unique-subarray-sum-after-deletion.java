class Solution {
    public int maxSum(int[] nums) {
        boolean[] map = new boolean[101];
        int res = 0;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            max = Math.max(max,i);
            if(i < 0){
                continue;
            }
            if(!map[i]){
                res += i;
                map[i] = true;
            }
        }
        return max < 0 ? max : res;
    }
}