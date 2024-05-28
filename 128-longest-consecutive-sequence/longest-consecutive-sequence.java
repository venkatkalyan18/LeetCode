class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for(int i:nums){
            set.add(i);
        }

        for(int i=0;i<nums.length;i++){
            int count= 0;
            if(!set.contains(nums[i]-1)){
                int j = nums[i];
                while(set.contains(j)){
                    count++;
                    j++;
                }

                ans = Math.max(ans,count);
            }
        }

        return ans;
    }
}