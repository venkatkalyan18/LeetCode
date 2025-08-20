class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int maxFreq = 0;
        int left = 0;
        int right = 0;
        int res = 0;
        while(right < s.length()){
            map[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq,map[s.charAt(right) - 'A']);
            while((right - left + 1) - maxFreq > k){
                map[s.charAt(left) - 'A']--;
                // maxFreq = 0;
                // for(int i=0;i<26;i++){
                //     maxFreq = Math.max(maxFreq,map[i]);
                // }
                left++;
            } 
            res = Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}