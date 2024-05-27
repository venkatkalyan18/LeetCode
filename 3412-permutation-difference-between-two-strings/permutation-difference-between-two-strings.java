class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;

        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }


        for(int i =0;i<t.length();i++){
            int diff = 0;
            diff = Math.abs(map.get(t.charAt(i)) - i);
            ans = ans + diff;
        }

        return ans;
    }
}