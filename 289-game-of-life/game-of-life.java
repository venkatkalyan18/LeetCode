class Solution {
    public void gameOfLife(int[][] board) {
        int m  = board.length;
        int n = board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int noOfNeighbors = countNeighbors(board,i,j);
                if(board[i][j] == 1){
                    if(noOfNeighbors < 2 || noOfNeighbors > 3) {
                        board[i][j] = -1;  
                    }
                }
                else {
                    if(noOfNeighbors == 3) {
                        board[i][j] = 2;  
                    }
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == -1) {
                    board[i][j] = 0;
                } else if(board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }

    public int countNeighbors(int[][] board,int row,int col){
        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1},{-1,1},{-1,-1},{1,-1},{1,1}};
        int count = 0;
        for(int[] direction : directions){
            int r = direction[0] + row;
            int c = direction[1] + col;
            if(r >= 0 && c >= 0 && r < board.length && c < board[0].length){
                if(Math.abs(board[r][c]) == 1){  
                    count++;
                }
            }
        }
        return count;
    }
}
