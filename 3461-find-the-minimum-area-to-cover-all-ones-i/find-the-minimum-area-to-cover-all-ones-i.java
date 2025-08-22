class Solution {
    public int minimumArea(int[][] grid) {
        int[] hor = new int[2];
        hor[0] = Integer.MAX_VALUE;
        hor[1] = Integer.MIN_VALUE;
        int[] ver = new int[2];
        ver[0] = Integer.MAX_VALUE;
        ver[1] = Integer.MIN_VALUE;


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j] == 0) continue;

                hor[0] = Math.min(hor[0],i);
                hor[1] = Math.max(hor[1],i);

                ver[0] = Math.min(ver[0],j);
                ver[1] = Math.max(ver[1],j);

            }
        }

        return (hor[1] - hor[0] + 1) * (ver[1] - ver[0] +1);
    }
}