class Solution {
    public int uniquePaths(int m, int n) {
        int[][] hashTable = new int[m][n];
        return findPaths(0,0,m-1,n-1,hashTable);
    }

    public int findPaths(int i,int j,int m,int n,int[][] memo){
        if(i > m || j>n ){
            return 0;
        }

        if(i==m && j==n){
            return 1;
        }

        if(memo[i][j] != 0){
            return memo[i][j];
        }

        return memo[i][j] = findPaths(i+1,j,m,n,memo) + findPaths(i,j+1,m,n,memo);
    }
}