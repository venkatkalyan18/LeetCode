class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        
        // Array of vowels
        char[] eachVowels = {'a','e','i','o','u','A','E','I','O','U'};

        // Add all elements from the array to the list
        for (char vowel : eachVowels) {
            vowels.add(vowel);
        }
         StringBuilder sb = new StringBuilder(s);
         int i=0;
         int j=s.length()-1;
         while(i<j){
            if(vowels.contains(sb.charAt(i)) && vowels.contains(sb.charAt(j))){
                if(sb.charAt(i) != sb.charAt(j)){
                    char temp = sb.charAt(i);
                    sb.setCharAt(i,sb.charAt(j));
                    sb.setCharAt(j,temp);
                }
                i++;
                j--;
            }
                else if(!vowels.contains(sb.charAt(i))){
                    i++;
                }else{
                    j--;
                }
            
         }
         return sb.toString();
    }
}