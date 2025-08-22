class Solution {
    public int minimumArea(int[][] grid) {
        int[] hor = new int[2];
        hor[0] = -1;
        hor[1] = -1;
        int[] ver = new int[2];
        ver[0] = Integer.MAX_VALUE;
        ver[1] = Integer.MIN_VALUE;


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    hor[0] = i;
                    break;
                }
            }
            if(hor[0] != -1){
                break;
            }
        }

        for(int i=grid.length-1;i>=0;i--){
            for(int j=grid[0].length-1;j>=0;j--){
                if(grid[i][j] == 1){
                    hor[1] = i;
                    break;
                }
            }
            if(hor[1] != -1){
                break;
            }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    ver[0] = Math.min(ver[0],j);
                    ver[1] = Math.max(ver[1],j);
                } 
            }
        }

        return (hor[1] - hor[0] + 1) * (ver[1] - ver[0] +1);
    }
}