class Solution {
    public int lengthOfLongestSubstring(String c) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int i = 0;
        int j = 0;
        while(j<c.length()){
            if(map.containsKey(c.charAt(j)) && map.get(c.charAt(j)) >= i){
                i = map.get(c.charAt(j)) + 1;
            }
                
            map.put(c.charAt(j),j);
            ans = Math.max(ans,j-i+1);
            j++;


        }

        return ans;
    }
}