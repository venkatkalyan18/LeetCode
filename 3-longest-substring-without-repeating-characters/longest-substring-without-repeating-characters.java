class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i = 0;
        while(i<s.length()){
            int length = 0;
            HashSet<Character> set = new HashSet<>();

            while(i<s.length() && !set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                length++;
                i++;
            }
            if(i<s.length()){
                char temp = s.charAt(i);

            while(s.charAt(i-1) != temp){
                i--;
            }
            }
            

            maxLength = Math.max(length, maxLength);
        }

        return maxLength;
    }
}