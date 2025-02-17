class Solution {
    public int[] constructDistancedSequence(int n) {
        boolean[] isUsed = new boolean[n + 1];
        int[] res = new int[2 * n - 1];
        helper(n, res, isUsed, 0);
        return res;
    }

    public boolean helper(int n, int[] res, boolean[] isUsed, int idx) {
        if (idx == res.length) return true;

        if (res[idx] != 0) return helper(n, res, isUsed, idx + 1); 

        for (int i = n; i > 0; i--) { 
            if (i != 1 && !isUsed[i] && idx + i < res.length && res[idx + i] == 0) {
                isUsed[i] = true;
                res[idx] = i;
                res[idx + i] = i; 

                if (helper(n, res, isUsed, idx + 1)) {
                    return true;
                }

                isUsed[i] = false;
                res[idx] = 0;
                res[idx + i] = 0; 
            } else if (i == 1 && !isUsed[i]) {
                isUsed[i] = true;
                res[idx] = i;

                if (helper(n, res, isUsed, idx + 1)) {
                    return true;
                }

                isUsed[i] = false;
                res[idx] = 0;
            }
        }

        return false;
    }
}
