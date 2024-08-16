class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int ans = 0;
        for(int i = 0;i<m;i++){
            int k = i;
            int count = 0;
            for(int j=0;j<n;j++){
                k = i;
                int x = j;
                while(k<m && x<n && nums1[k] == nums2[x]){
                    count = Math.max(count,k-i+1);
                    k++;
                    x++;
                }
            }

            ans = Math.max(ans,count);
        }
        return ans;

    }
}