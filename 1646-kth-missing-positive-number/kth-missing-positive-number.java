class Solution {
    public int findKthPositive(int[] arr, int k) {
 
        int i = 0;
        int j = 1;
        int x = k;
        while(i<arr.length){

            if(arr[i] == j){
                i++;
            }else{
                k--; 
            }
             j++;

            if(k == 0){
                return j-1;
            }
        }

         return arr.length + x;
    }
}