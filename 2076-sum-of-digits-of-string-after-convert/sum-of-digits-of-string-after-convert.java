class Solution {
    public int getLucky(String s, int k) {
        String processed = "";
        int ans = 0;
        for(int i=0;i<s.length();i++){
            processed = processed + "" + ((int) s.charAt(i) -96);
        }
        while(k != 0){
           ans = 0;
           for(int i=0;i<processed.length();i++){
            ans = ans +processed.charAt(i) - '0'; 
           }
           processed = ans + "";
           k--;
        }

        return ans;
    }
}