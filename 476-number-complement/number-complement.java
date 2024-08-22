class Solution {
    public int findComplement(int num) {
        int ans = 0;
        int count = 0;
        while(num != 0){
            int bit = num & 1;
            if(bit == 0){
                ans = ans +(int) Math.ceil(Math.pow(2,count));
            }
            count++;
            num = num >> 1;
        }

        return ans;
    }
}