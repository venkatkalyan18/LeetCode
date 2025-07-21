class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            int count = 0;
            char ch = s.charAt(i);
            while(i < s.length() && s.charAt(i) == ch){
                count++;
                if(count < 3){
                    sb.append(ch);
                }
                i++;
            }
        }
        return new String(sb);
    }
}