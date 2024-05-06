class Solution {
    public int longestOnes(int[] nums, int k) {

        int longest = 0;
        int head = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==0) count++;

            while(count > k){
                if(nums[head]==0){
                    count--;
                }
                head++;
            }
            longest = Math.max(longest,i-head+1);
        }
        System.gc();
        return longest;
    }
}