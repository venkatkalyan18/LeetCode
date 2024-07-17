class Solution {
    public List<List<String>> solveNQueens(int n) {
       
        List<List<String>> ans = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        helper(n,0,board,new ArrayList<>(),ans);
        return ans;
    }

    public void helper(int n,int row,boolean[][] board,List<String> list,List<List<String>> ans){
        if(row == n){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int col = 0;col<n;col++){
            if(check(board,row,col)){
                board[row][col] = true;
                char[] chArray = new char[n];
                Arrays.fill(chArray,'.');
                chArray[col] = 'Q';
                list.add(new String (chArray));
                helper(n,row+1,board,list,ans);
                board[row][col] = false;
                list.remove(list.size()-1); 
            }
        }
    }
    public boolean check(boolean board[][],int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //check left

        int maxLeft = Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int maxRight = Math.min(board.length - col -1 ,row);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }
}