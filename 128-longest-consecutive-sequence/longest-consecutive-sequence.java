class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for(int i:nums){
            set.add(i);
        }

        for(int i :set){
            int count= 0;
            if(!set.contains(i-1)){
                int j = i;
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