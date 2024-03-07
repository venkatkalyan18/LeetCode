class Solution {
    public String mergeAlternately(String word1, String word2) {
        String processed="";
        int len=Math.min(word1.length(),word2.length());
        int count=0;
        while(count!=len){
            processed+=word1.charAt(count);
            processed+=word2.charAt(count);
            count++;
        }
        int flag=count;
        while(flag<word1.length()){
             processed+=word1.charAt(flag);
             flag++;
        }
        while(count<word2.length()){
             processed+=word2.charAt(count);
             count++;
        }

        return processed;
    }
}