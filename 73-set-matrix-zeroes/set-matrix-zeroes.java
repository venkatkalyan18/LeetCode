class Solution {
    public void setZeroes(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int[] rowArray = new int[rowSize];
        int[] colArray = new int[colSize];

        for(int i = 0;i<rowSize;i++){
            for(int j = 0;j<colSize;j++){
                if(matrix[i][j] == 0){
                    rowArray[i] = -1;
                    colArray[j] = -1;
                }
            }
        }

        for(int i = 0;i<rowSize;i++){
            for(int j = 0;j<colSize;j++){
                if(rowArray[i] == -1 || colArray[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}