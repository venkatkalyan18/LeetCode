class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] arr = new int[obstacleGrid.length][obstacleGrid[0].length];
for (int i = 0; i < arr.length; i++) {
    Arrays.fill(arr[i], -1); 
}
       return paths(obstacleGrid,0,0,arr);
    }

    public int paths(int[][] obstacleGrid,int r,int c,int[][] arr){
        if(r>obstacleGrid.length-1 || c>obstacleGrid[0].length-1){
            return 0;
        }
        if(obstacleGrid[r][c] == 1){
            return 0;
        } 

        if(r == obstacleGrid.length-1 && c == obstacleGrid[0].length-1){
            return 1;
        }

        if(arr[r][c] != -1){
            return arr[r][c];
        }
        arr[r][c] = paths(obstacleGrid,r+1,c,arr) + paths(obstacleGrid,r,c+1,arr);

        return arr[r][c];
        

    }
}