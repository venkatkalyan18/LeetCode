class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] left = new int[26];
        int[] right = new int[26];
        int res = 0;
        Arrays.fill(left,-1);

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(left[ch-'a'] == -1){
                left[ch-'a'] = i;
            }else{
                right[ch-'a'] = i;
            }
        }

        for(char ch = 'a';ch<='z';ch++){
            boolean[] isTaken = new boolean[26];
            int leftIdx = left[ch-'a'];
            int rightIdx = right[ch-'a'];
            for(int i=leftIdx+1;i<rightIdx;i++){
                char c = s.charAt(i);
                if(!isTaken[c-'a']){
                    res++;
                    isTaken[c-'a'] = true;
                }
            }
            
        }
        return res;
    }
}

