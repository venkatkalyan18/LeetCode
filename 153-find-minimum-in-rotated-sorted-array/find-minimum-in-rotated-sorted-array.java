class Solution {
    public int findMin(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] >= arr[left]){
                min = Math.min(min,arr[left]);
                left =  mid + 1;
            }else{
                min = Math.min(min,arr[mid]);
                right = mid - 1;
            }
        }

        return min;
    }
}