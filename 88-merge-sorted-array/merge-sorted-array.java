class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m==0 && n==0){
            return;
        }

        int left = m-1;
        int right = m+n-1;

        int i = n-1;
        while(i>=0){
            if(left >= 0 && nums2[i] < nums1[left]){
                nums1[right] = nums1[left];  
                left--; 
                
            }else{
                nums1[right] = nums2[i];
                i--;
            }

            right--;
            

           
        }

        
    }
}