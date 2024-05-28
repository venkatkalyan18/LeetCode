class Solution {
    public int numberOfSpecialChars(String word) {
        int[] smallLettersArray = new int[26];
        int[] capitalLettersArray = new int[26];
        int ans = 0;
        for(int i=0;i<word.length();i++){
            int index =0;
            if(word.charAt(i) >= 65 && word.charAt(i)<=90){
                index = word.charAt(i)-'A';
                capitalLettersArray[index]=1;
            }else{
                index = word.charAt(i)-'a';
                smallLettersArray[index]=1;
            }
        }

        for(int i=0;i<26;i++){
            if(smallLettersArray[i] == 1 && capitalLettersArray[i]==1){
                ans++;
            }
        }

        return ans;
    }
}