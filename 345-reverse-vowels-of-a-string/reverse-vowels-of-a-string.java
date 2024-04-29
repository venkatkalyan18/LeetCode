class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
         StringBuilder sb = new StringBuilder(s);
         int i=0;
         int j=s.length()-1;
         while(i<j){
            if(vowels.indexOf(sb.charAt(i)) != -1&& vowels.indexOf(sb.charAt(j)) != -1){
                if(sb.charAt(i) != sb.charAt(j)){
                    char temp = sb.charAt(i);
                    sb.setCharAt(i,sb.charAt(j));
                    sb.setCharAt(j,temp);
                }
                i++;
                j--;
            }
                else if(vowels.indexOf(sb.charAt(i)) == -1){
                    i++;
                }else{
                    j--;
                }
            
         }
         return sb.toString();
    }
}