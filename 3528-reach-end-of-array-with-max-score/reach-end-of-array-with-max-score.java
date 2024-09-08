class Solution {
    public long findMaximumScore(List<Integer> nums) {
        int prev = 0;
        long ans = 0;
        for(int i=1;i<nums.size();i++){
            if(nums.get(prev) < nums.get(i)){
                ans+=(long)(i-prev) * nums.get(prev);
                prev = i;
            }
        }
        ans+= (long)(nums.size()-1 - prev) *  nums.get(prev);
        return ans;
    }
}