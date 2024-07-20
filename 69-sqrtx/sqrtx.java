class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int i = 1;
        int j = x;
        int ans = 0;
        while (i <= j) {
            int mid = i + (j - i) / 2; 
            if ((long) mid * mid == x) {
                return mid;
            }
            if ( (long)mid * mid > x) {
                j = mid - 1;
            } else {
                i = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
