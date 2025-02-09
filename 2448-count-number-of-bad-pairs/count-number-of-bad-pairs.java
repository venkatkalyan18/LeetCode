class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Long,Long> map = new HashMap<>();
        long noOfGood = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            long target = nums[i] - i;
            if(map.containsKey(target)){
                noOfGood += map.get(target);
            }
            map.put(target,map.getOrDefault(target, 0L) + 1L);
        }

        long totalPairs = ((long) n * (n - 1)) / 2;
        return totalPairs - noOfGood;
    }
}