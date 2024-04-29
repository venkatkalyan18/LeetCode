class Solution {
    public String mergeAlternately(String word1, String word2) {
        String processed = "";
        int x = 0;
        while(x<word1.length() || x<word2.length()){
            if(x<word1.length()){
                processed+=word1.charAt(x);
            }
            if(x<word2.length()){
                processed+=word2.charAt(x);
            }
            x++;
        }

        return processed;
        
    }
}