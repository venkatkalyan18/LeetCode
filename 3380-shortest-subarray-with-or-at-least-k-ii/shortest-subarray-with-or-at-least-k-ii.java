class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int res = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int[] bits = new int[32];

        while(right < nums.length){
            addBits(bits,nums[right]);
            while(left <= right && getVal(bits) >= k){
                res = Math.min(res,right - left + 1);
                removeBits(bits,nums[left]);
                left++;
            }
            right++;
        }

        if(res == Integer.MAX_VALUE) return -1;
        return res;
    }

    public void addBits(int[] bits,int num){
        int n = 0;
        while(num > 0){
            bits[n++] += (num & 1);
            num = num >> 1;
        }
    }

    public void removeBits(int[] bits,int num){
        int n = 0;
        while(num > 0){
            bits[n++] -= (num & 1);
            num = num >> 1;
        }
    }


    public int getVal(int[] bits){
        int val = 0;
        for(int i=0;i<32;i++){
            if(bits[i] != 0){
                val = val + (int)Math.pow(2,i);
            }
        }
        return val;
    }
}