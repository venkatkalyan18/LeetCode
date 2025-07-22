class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int res = 0;
        int temp = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length){
            while(map.contains(nums[right])){
                temp -= nums[left];
                map.remove(nums[left]);
                left++;
            }
            temp = temp + nums[right];
            map.add(nums[right]);
            res = Math.max(temp,res);
            right++;
        }
        return res;
    }
}