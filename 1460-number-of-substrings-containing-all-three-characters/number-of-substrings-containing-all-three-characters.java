import java.util.HashMap;

class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() == 3) {
                res += (n - right); 
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++; 
            }
        }
        return res;
    }
}
