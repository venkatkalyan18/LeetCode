class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            int num = -nums[i];
            if(set.contains(num)){
                ans = Math.max(ans,Math.abs(num));
            }else{
                set.add(nums[i]);
            }
        }

        return ans;
    }
}