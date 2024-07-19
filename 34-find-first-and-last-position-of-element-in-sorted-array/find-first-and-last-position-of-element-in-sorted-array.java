class Solution {
    public int[] searchRange(int[] arr, int target) {
        // Find lesser number than target

        if(arr.length == 0){
              return new int[]{-1,-1};
        }

        int left = 0;
        int right = arr.length-1;
        int first = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] < target){
                first = mid;
                left = left + 1;
            }else{
                right = right -1;
            }
        }

        if(first + 1 == arr.length || arr[first+1] != target){
            return new int[]{-1,-1};
        }

        left = 0;
        right = arr.length-1;
        int last = arr.length;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] > target){
                last = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return new int[]{first+1,last-1};

        
    }
}