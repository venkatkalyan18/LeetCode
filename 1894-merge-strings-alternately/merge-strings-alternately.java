class Solution {
    public String mergeAlternately(String word1, String word2) {
        String processed = "";
        int x = 0;
        int y= 0;
        while(x!=word1.length() || y!=word2.length()){
            if(x!=word1.length()){
                processed+=word1.charAt(x);
                x++;
            }
            if(y!=word2.length()){
                processed+=word2.charAt(y);
                y++;
            }
        }

        return processed;
        
    }
}