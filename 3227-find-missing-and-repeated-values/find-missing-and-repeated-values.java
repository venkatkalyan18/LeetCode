class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] hash = new int[(n * n) + 1];
        for(int i = 0;i<n;i++){
            for(int j= 0;j<n;j++){
                hash[grid[i][j]]++;
            }
        }


        int a = 0;
        int b = 0;
        for(int i=1;i<=n*n;i++){
            if(hash[i] == 2){
                a = i;
            }

            if(hash[i] == 0){
                b = i;
            }
        }

        return new int[]{a,b};
    }
}