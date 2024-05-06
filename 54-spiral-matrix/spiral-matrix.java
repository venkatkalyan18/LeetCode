class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

		int turn = 0;
		int top=0;
		int bottom = matrix.length-1;
		int left = 0;
		int right = matrix[0].length-1;
		while(left<=right && top<=bottom){
			if(turn==0){
				for(int i=left;i<=right;i++){
					list.add(matrix[top][i]);
				}
				top++;
			}

			if(turn==1){
				for(int i=top;i<=bottom;i++){
					 list.add(matrix[i][right]);
				}
				right--;
			}

			if(turn==2){
				for(int i=right;i>=left;i--){
					 list.add(matrix[bottom][i]);
				}
				bottom--;
			}

			if(turn==3){
				for(int i = bottom;i>=top;i--){
					list.add(matrix[i][left]);
				}
				left++;
			}

			turn= (turn+1)%4;


		}

        return list;
	
    }
}