class Solution {
    public int minimumChairs(String s) {
        int ans = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'E'){
                count++;
            }else{
                count--;
            }

            ans = Math.max(ans,count);
        }

        return ans;
    }
}