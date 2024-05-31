class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        int ans =0;
        int i =0;
        int  j=0;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))  && map.get(s.charAt(j)) >= i){
                i = map.get(s.charAt(j)) + 1;
            }

             map.put(s.charAt(j),j);
             ans = Math.max(ans,j-i+1);
             j++;
        }

        return ans;
    }
}