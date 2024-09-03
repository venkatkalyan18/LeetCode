class Solution {
    public int getLucky(String s, int k) {
        String processed = "";
        int ans = 0;
        for(int i=0;i<s.length();i++){
            processed = processed + "" + ((int) s.charAt(i) -96);
        }
        while(k != 0){
           int temp = 0;
           for(int i=0;i<processed.length();i++){
            temp = temp +processed.charAt(i) - '0'; 
           }
           ans = temp;
           processed = ans + "";
           k--;
        }

        return ans;
    }
}