class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int[][] directions = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int[][] isVisited = new int[grid.size()][grid.get(0).size()];
        Boolean[][][] dp = new Boolean[grid.size()][grid.get(0).size()][health+1];
        if(grid.get(0).get(0) == 1){
            return helper(grid,health-1,0,0,directions,isVisited,dp);
        }
        return helper(grid,health,0,0,directions,isVisited,dp);
    }

    public boolean helper(List<List<Integer>> grid, int health,int row,int col,int[][] directions,int[][] isVisited,Boolean[][][] dp  ){
        if(health <= 0){
            return false;
        }

        if(row == grid.size()-1 && col == grid.get(0).size()-1){
            return true;
        }

        if(dp[row][col][health] != null){
            return dp[row][col][health];
        }

        isVisited[row][col] = 1;


        for(int[] direction : directions){
            int r = row + direction[0];
            int c = col + direction[1];
            if(r >=0 && c>=0 && r < grid.size() && c < grid.get(0).size() && isVisited[r][c] != 1){
                if(helper(grid,health - grid.get(r).get(c),r,c,directions,isVisited,dp)){
                    return  true;
                }
            }
        }
        
        isVisited[row][col] = 0;
        return dp[row][col][health] = false;
    }
}