class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int i =0;
        int ans = Integer.MIN_VALUE;
        while(i+k < energy.length){
            int j = i+k;
            int sum = energy[i];
            while(j < energy.length && sum > 0){
                sum = sum+energy[j];
                j+=k;
            }
            if(j >= energy.length){
                  ans = Math.max(ans,sum);
            }
            i++;
        }

        int m = energy.length-1;
        int max = energy[m];
        while(m+k >= energy.length){
            max = Math.max(max,energy[m]);
            m--;
        }

       ans= Math.max(ans,max);

        return ans;
    }
}