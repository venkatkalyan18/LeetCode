class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] isVisited = new boolean[tiles.length()];
        helper(tiles,isVisited,set,"");
        return set.size();
    }

    public void helper(String str,boolean[] isVisited,Set<String> set,String up){
        if(up.length() == str.length()){
            return ;
        }

        for(int i=0;i<str.length();i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                String s = up + str.charAt(i);
                set.add(s);
                helper(str,isVisited,set,s);
                isVisited[i] = false;
            }
        }
    }
}