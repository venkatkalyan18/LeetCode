class Solution {
    int flag = 0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        boolean[][] isVisited = new boolean[grid1.length][grid1[0].length];
        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
        int ans = 0;
        for(int i=0;i<grid1.length;i++){
            for(int j=0;j<grid1[0].length;j++){
                if(grid1[i][j] == 1 && grid2[i][j] == 1 && !isVisited[i][j]){
                    flag = 0;
                    helper(grid1,grid2,i,j,isVisited,directions);
                    if(flag != 1){
                        ans++;
                    }
                }
            }
        }

        return ans;
    }

    public  void helper(int[][] grid1,int[][] grid2,int row,int col,boolean[][] isVisited,int[][] directions){
        for(int[] direction : directions){
            int i = row + direction[0];
            int j = col + direction[1];
            if(i >=0 && j >=0 && i<grid1.length && j<grid1[0].length && grid2[i][j] == 1 && !isVisited[i][j]){
                if(grid1[i][j] == 1 ){
                   isVisited[i][j] = true;
                   helper(grid1,grid2,i,j,isVisited,directions);
                }else{
                    flag = 1;
                }
            }
        }
    }
}