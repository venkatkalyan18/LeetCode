class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        int ans = 0;
        int[][] directions = {{1,0},{0,1},{0,-1},{-1,0}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!isVisited[i][j] && grid[i][j] != '0'){
                    ans++;
                    helper(grid,isVisited,i,j,directions);
                }
            }
        }

        return ans;
    }

    public void helper(char[][] grid,boolean[][] isVisited,int i,int j,int[][] directions){
   
        for(int[] direction : directions){
            int row = i + direction[0];
            int col = j + direction[1];
            if(row>=0 && col>=0 && row<grid.length && col<grid[0].length && !isVisited[row][col] && grid[row][col] != '0'  ){
                isVisited[row][col] = true;
                helper(grid,isVisited,row,col,directions);
            }
        }
    }
}