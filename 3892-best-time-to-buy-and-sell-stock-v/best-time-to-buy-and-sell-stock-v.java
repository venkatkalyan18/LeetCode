class Solution {
   static public long maximumProfit(int[] prices, int k) {
        long ans = 0;
        int n = prices.length;
        Long[][][] dp = new Long[n][k + 1][3];
        long res = solve(0, k, 0, n, prices, dp);
        return res;
    }

    static long solve(int i, int k, int decider, int n, int[] prices, Long[][][] dp) {
        if (i == n) {
            if (k >= 0 && decider == 0)
                return 0;
            return Integer.MIN_VALUE;
        }

        if (dp[i][k][decider] != null) {
            return dp[i][k][decider];
        }

        long take = Integer.MIN_VALUE, dontTake = Integer.MIN_VALUE;
        if (k > 0) {
            if (decider == 1) { 
                take = prices[i] + solve(i + 1, k - 1, 0, n, prices, dp);
            } else if (decider == 2) { 
                take = -prices[i] + solve(i + 1, k - 1, 0, n, prices, dp);
            } else {
                take = Math.max(prices[i] + solve(i + 1, k, 2, n, prices, dp),
                        -prices[i] + solve(i + 1, k, 1, n, prices, dp));
            }
        }

        dontTake = solve(i + 1, k, decider, n, prices, dp);
        return dp[i][k][decider] = Math.max(take, dontTake);
    }
}