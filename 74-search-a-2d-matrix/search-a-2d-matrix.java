class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int colThatHasEle = -1;
        for(int i =0 ;i<rowSize;i++){
            if(matrix[i][0] <= target){
                colThatHasEle = i;
            }
        }

        if(colThatHasEle == -1){
            return false;
        }

        int left  = 0;
        int right = colSize - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(matrix[colThatHasEle][mid] == target){
                return true;
            }
            if(matrix[colThatHasEle][mid] > target){
                right = mid - 1;
            }else{
                left = mid+1;
            }
        }

        return false;
    }
}