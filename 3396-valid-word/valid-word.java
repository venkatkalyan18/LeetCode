class Solution {
    public boolean isValid(String word) {
        word = word.toLowerCase();
        int n = word.length();
        if(n < 3){
            return false;
        }
        boolean hasConsonant = false;
        boolean hasVowel = false;
        String vowels = "aeiou";

        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(vowels.indexOf(ch) != -1){
                hasVowel = true;
            }else if(ch >= 'a' && ch <= 'z'){
                hasConsonant = true;
            }else if(!Character.isDigit(ch)){
                return false;
            }
        }
        System.out.println(hasVowel);

        return hasVowel && hasConsonant;
    }
}