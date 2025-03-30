class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), i);
        }

        int max = 0;
        int left = 0;
        for(int i = 0;i<s.length();i++){
            max = Math.max(max,map.get(s.charAt(i)));
            if(max == i){
                res.add(i - left + 1);
                left = i + 1;
            }
        }

        return res;
    }
}