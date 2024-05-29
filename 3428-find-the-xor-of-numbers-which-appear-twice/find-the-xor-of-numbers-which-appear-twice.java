class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                ans = ans ^ nums[i];
            }
        }

        return ans;
    }
}