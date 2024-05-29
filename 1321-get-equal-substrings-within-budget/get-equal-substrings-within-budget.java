class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i =0;
        int j=0;
        int maxLength =0;
        while(j<s.length()){
            if(s.charAt(j) != t.charAt(j)){
                int cost = Math.abs(s.charAt(j) - t.charAt(j));
                while(i<s.length() && maxCost - cost < 0){
                    maxCost = maxCost + Math.abs((s.charAt(i) - t.charAt(i)));
                    i++;
                }
                maxCost-=cost;
            }
            maxLength = Math.max(maxLength,j-i+1); 
            j++;
        }

        return maxLength;
    }
}