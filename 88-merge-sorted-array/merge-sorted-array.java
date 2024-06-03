class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m == 0 &&  n == 0){
            return;
        }

        if(m == 0){
            nums1[0] = nums2[0];
        }

        int i = m-1;
        int j = m+n-1;
        int k = n-1;

        while(k>=0){
            if(i>=0 && (nums1[i] > nums2[k])){
                
                nums1[j] = nums1[i];
                i--;
            }else{
                nums1[j] = nums2[k];
                k--;
            }

            j--;

        }
    }
}