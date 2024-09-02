class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int j : chalk) {
            sum += j;
        }
        
        k %= sum;

        int i = 0;
        while (k >= chalk[i]) {
            k -= chalk[i];
            i++;
        }
        
        return i;
    }
}