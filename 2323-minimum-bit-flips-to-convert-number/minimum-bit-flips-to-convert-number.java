class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0;
        while(start != 0 || goal != 0){
            if(start == goal){
                return ans;
            }
            int startBit = 0;
            int goalBit = 0;
            if(start != 0){
                startBit = start & 1;
                start = start >> 1;
            }

            if(goal != 0){
                goalBit = goal & 1;
                goal = goal >> 1;
            }

            if(startBit != goalBit ){
                ans++;
            }
        }

        return ans;
    }
}