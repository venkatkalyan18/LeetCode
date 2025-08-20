class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        for(char c = 'A';c<='Z';c++){
            int max = 0;
            int tempK = 0;
            int lastCharIdx = 0;
            int left = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) != c){
                    tempK++;
                }

                while(left < i && tempK > k){
                    if(s.charAt(left) != c){
                        tempK--;
                    }
                    left++;
                }

                max = Math.max(max,(i - left + 1));
            }

            res = Math.max(res,max);
        }

        return res;
    }
}