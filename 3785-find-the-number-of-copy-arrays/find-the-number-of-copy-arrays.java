class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int left = bounds[0][0];
        int right = bounds[0][1];
        int diff = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < bounds.length; i++) {
             diff += original[i] - original[i - 1];
             left = Math.max(bounds[i ][0] - diff, left);
             right = Math.min(bounds[i ][1] - diff, right);
            res = Math.min(res, right - left + 1);
            
        }
        return res < 0 ? 0 : res;
    }
}
