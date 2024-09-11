class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0;
        while (start != 0 || goal != 0) {
            int startBit = start & 1;
            int goalBit = goal & 1;
            if (startBit != goalBit) {
                ans++;
            }
            start = start >> 1;
            goal = goal >> 1;
        }

        return ans;
    }
}