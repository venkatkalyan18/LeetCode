class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans  =0 ;
        for(int i : nums){
            set.add(i);
        }

        for(int i =0;i<nums.length;i++){
            int count = 0 ;
            int number = nums[i];
            if(!set.contains(number - 1)){
                while(set.contains(number)){
                number++;
                count++;
            }
            }
            ans = Math.max(ans,count);
        }

        return ans;
    }
}