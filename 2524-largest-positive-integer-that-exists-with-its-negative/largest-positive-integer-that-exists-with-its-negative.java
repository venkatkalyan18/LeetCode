class Solution {
    public int findMaxK(int[] nums) {
        boolean[] vis = new boolean[2001];
        int ans = -1;
        
        for (int el : nums) {
            if (vis[-el + 1000]) ans = Math.max(ans, Math.abs(el));
            vis[el + 1000] = true;
        }
        
        return ans; 

    }
}