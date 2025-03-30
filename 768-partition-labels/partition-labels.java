class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] map = new int[26];
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            map[s.charAt(i) - 'a'] = i;
        }

        int max = 0;
        int left = 0;
        for(int i = 0;i<s.length();i++){
            max = Math.max(max,map[s.charAt(i) - 'a']);
            if(max == i){
                res.add(i - left + 1);
                left = i + 1;
            }
        }

        return res;
    }
}