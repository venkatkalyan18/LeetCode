class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0;
        int odd = 0;
        for(int i : nums){
            if(i % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        int[] res = new int[nums.length];
        int x = even;
        while(x < nums.length){
            res[x++]  = 1;
        }

        return res;
        
    }
}