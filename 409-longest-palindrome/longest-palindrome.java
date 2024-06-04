class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;

        for(int i = 0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }
        }



        for(char ch: map.keySet()){
            if(map.get(ch) % 2 == 0){
                ans=ans+map.get(ch);
            }else{
                if(ans % 2 == 0){
                    ans = ans + 1;
                }
                ans = ans + (map.get(ch) - 1);
            }
        }

        return ans;
    }
}