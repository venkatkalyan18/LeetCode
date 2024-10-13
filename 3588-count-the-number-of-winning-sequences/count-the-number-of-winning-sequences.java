class Solution {
    int MOD = (int) Math.pow(10, 9) + 7;

    public int countWinningSequences(String s) {
        Integer[][][] dp = new Integer[3][s.length() + 1][2001];
        int result = helper(s, -1, s.length() - 1, 0, dp);
        return result ; 
    }

    public int helper(String s, int lastUsed, int round, int bobPoints, Integer[][][] dp) {
        if (round < 0) {
            return bobPoints > 0 ? 1 : 0;
        }

        if (lastUsed != -1 && dp[lastUsed][round][bobPoints + 1000] != null) {
            return dp[lastUsed][round][bobPoints + 1000];
        }

        String powers = "FWE";
        int ans = 0;
        for (int i = 0; i < powers.length(); i++) {
            if (i != lastUsed) {
                char power = powers.charAt(i);
                if ((power == 'F' && s.charAt(round) == 'E') || 
                    (power == 'W' && s.charAt(round) == 'F') || 
                    (power == 'E' && s.charAt(round) == 'W')) {
                    
                    ans = (ans + helper(s, i, round - 1, bobPoints + 1, dp)) % MOD;
                } else if (power == s.charAt(round)) {
                    ans = (ans + helper(s, i, round - 1, bobPoints, dp)) % MOD;
                } else {
                    ans = (ans + helper(s, i, round - 1, bobPoints - 1, dp)) % MOD;
                }
            }
        }

        if (lastUsed != -1) {
            dp[lastUsed][round][bobPoints + 1000] = ans;
        }

        return ans;
    }
}
