class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] res = new int[(n/3)][3];
        int x = 0;
        for(int i=0;i<nums.length-2;i+=3){
            if(Math.abs(nums[i] - nums[i+1]) <= k && Math.abs(nums[i+1] - nums[i+2]) <= k && Math.abs(nums[i] - nums[i+2]) <=k ){
                res[x][0] = nums[i];
                res[x][1] = nums[i+1];
                res[x][2] = nums[i+2];
                x++;
            }else{
                return new int[0][0];
            }
        }

        return res;
    }
}