import java.util.Arrays;

class Solution {
    public int numTilePossibilities(String tiles) {
        char[] arr = tiles.toCharArray();
        Arrays.sort(arr); 
        return helper(arr, new boolean[arr.length]);
    }

    public int helper(char[] tiles, boolean[] isUsed) {
        int count = 0;
        for (int i = 0; i < tiles.length; i++) {
            if (isUsed[i]) continue;

            if (i > 0 && tiles[i] == tiles[i - 1] && !isUsed[i - 1]) {
                continue;
            }

            isUsed[i] = true;
            count += 1 + helper(tiles, isUsed);
            isUsed[i] = false;
        }
        return count;
    }
}
