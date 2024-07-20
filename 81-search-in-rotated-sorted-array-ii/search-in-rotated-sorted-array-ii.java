class Solution {
    public boolean search(int[] arr, int target) {
        int left = 0;
        int right  = arr.length-1;
        while(left <= right){
            int mid = (left+ right) / 2;
            if(arr[mid] == target){
                return true;
            }

            if(arr[left] == arr[right]){
                left++;
                continue;
            }

            if(arr[mid] <= arr[right]){
                if(arr[mid] <= target && arr[right] >= target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else{
                if(arr[left] <= target && arr[mid] >= target){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }

        return false;
    }
}