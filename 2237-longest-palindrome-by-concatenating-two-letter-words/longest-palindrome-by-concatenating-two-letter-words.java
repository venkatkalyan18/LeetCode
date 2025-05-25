class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i =0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        int res = 0;
        boolean flag = false;
        for(int i = 0;i<words.length;i++){
            String rev = getRevString(words[i]);
            if(map.containsKey(rev) && map.get(rev) > 0 && map.get(words[i]) > 0){
                if(rev.equals(words[i]) && map.get(rev) == 1 ){
                    if(flag){
                        continue;
                    }
                    res += rev.length();
                    flag = true;
                    map.put(rev,map.get(rev)-1);
                    continue;
                }
                res +=(2 * rev.length());
                map.put(rev,map.get(rev)-1);
                map.put(words[i],map.get(words[i])-1);
            }
        }

        return res;

    }

    public static String getRevString(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();

    }
}