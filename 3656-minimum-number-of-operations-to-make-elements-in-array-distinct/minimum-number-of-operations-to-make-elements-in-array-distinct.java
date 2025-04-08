class Solution {
    public int minimumOperations(int[] nums) {
        int[] map = new int[101];
        for(int i=nums.length-1;i>=0;i--){
            if(map[nums[i]] == 1){
                return (int) Math.ceil((double)(i+1)/3);
            }

            map[nums[i]] = 1;
        }

        return 0;
    }
}