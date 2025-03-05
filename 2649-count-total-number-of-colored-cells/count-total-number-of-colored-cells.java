class Solution {
    public long coloredCells(int n) {
        if(n == 1){
            return 1;
        }
        n--;
        return 1 + 4*((long)n*(n + 1) / 2);

        
    }
}
    