class Solution {
    public int numTilePossibilities(String tiles) {
         char[] arr = tiles.toCharArray();
        Arrays.sort(arr);
        return helper(new String(arr),new boolean[tiles.length()]);
    }

    public int helper(String tiles,boolean[] isUsed){

        int count = 0;
        for(int i = 0;i<tiles.length();i++){
            if(!isUsed[i]){
                isUsed[i] = true;
                count += (1 + helper(tiles,isUsed));
                isUsed[i] = false;
                while( i < tiles.length() -1 && tiles.charAt(i) == tiles.charAt(i+1)  ){
                     i++;
                }
            }

        }

        return count;
    }
}