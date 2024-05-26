class Solution {
    public String compressedString(String word) {
        String ans = "";
        int i =0;
        while(i<word.length()){
            char ch = word.charAt(i);
            int count  = 0;
            while(i<word.length() && ch == word.charAt(i)){
                i++;
                count++;
            }

            while(count -9  >= 0){
                ans = ans + 9 + "" + ch;
                count-=9;
            }

            if(count>0){
                ans = ans + count + "" + ch;
            }

        }

        return ans;
    }
}