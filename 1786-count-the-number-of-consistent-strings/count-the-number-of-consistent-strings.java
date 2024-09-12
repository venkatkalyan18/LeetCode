class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] set = new int[26];
        for(int i=0;i<allowed.length();i++){
            char ch = allowed.charAt(i);
            set[ch - 'a'] = 1; 
        }
        int ans = 0;
        for(int i=0;i<words.length;i++){
            int j = 0;
            for(j = 0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if(set[ch - 'a'] == 0){
                    break;
                }
            }

            if(j == words[i].length()){
                ans++;
            }
        }
        return ans;
    }
}