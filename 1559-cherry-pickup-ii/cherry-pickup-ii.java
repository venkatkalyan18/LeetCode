class Solution {
    public int cherryPickup(int[][] grid) {
        Integer[][][] dp = new Integer[grid.length][grid[0].length][grid[0].length];
        return helper(grid,0,0,grid[0].length-1,dp);
    }

    public int helper(int[][] grid,int row,int col1,int col2,Integer[][][] dp){
        if(col1 < 0 || col2<0 || col1 >= grid[0].length || col2 >= grid[0].length){
            return -100000001;
        }
        if(row == grid.length-1){
            if(col1 == col2){
                return grid[row][col1];
            }
            return grid[row][col1] + grid[row][col2];
        }

        if(dp[row][col1][col2] != null) return dp[row][col1][col2];
        
        int maxi = 0;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if(col1== col2){
                    maxi = Math.max(maxi,grid[row][col1] + helper(grid,row+1,col1+i,col2+j,dp));
                }else{
                    maxi = Math.max(maxi,grid[row][col1] + grid[row][col2] + helper(grid,row+1,col1+i,col2+j,dp));
                }
            }
        }

        return dp[row][col1][col2] = maxi;
    }
}