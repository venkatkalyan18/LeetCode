class Solution {
    public String compressedString(String word) {
        String ans = "";
        int i =0;
        while(i<word.length()){
            char ch = word.charAt(i);
            int count  = 0;
            while(i<word.length() && ch == word.charAt(i) && count < 9){
                i++;
                count++;
            }
           
                ans = ans + count + "" + ch;
        }
        return ans;
    }
}