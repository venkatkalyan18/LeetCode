class Solution {
    public int longestSubsequence(String s, int k) {
        int res = 0;
        int currVal = 0;
        int n = s.length() - 1;
        for (int i = n; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                int val = (int) Math.pow(2, n - i);
                if ((long) currVal + val <= (long) k) {
                    res++;
                    currVal += val;
                }
            } else {
                res++;
            }
        }
        return res;
    }
}
