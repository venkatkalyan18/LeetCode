class Solution {
    public long coloredCells(int n) {
        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 5;
        }
        long sum = 0;
        for(int i = 3;i<=n;i++){
            sum += 4*(i-1);
        }

        return sum + 5;
    }
}
    