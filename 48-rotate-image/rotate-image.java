class Solution {
    public void rotate(int[][] matrix) {
        int left  =  0;
        int right = matrix[0].length - 1;
        

        for(int i =0;i<matrix.length;i++){
            for(int j =i;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]= temp;
            }
        }

        while (left < right) {
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }
            left++;
            right--;
        }
    }
}