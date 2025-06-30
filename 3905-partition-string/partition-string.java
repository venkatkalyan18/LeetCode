class Solution {
    public List<String> partitionString(String s) {
        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        String curr = "";
        for(int i=0;i<s.length();i++){
            curr = curr + s.charAt(i);
            if(!set.contains(curr)){
                set.add(curr);
                res.add(curr);
                curr = "";
            }
        }

        return res;
    }
}