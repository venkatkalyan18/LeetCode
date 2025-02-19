class Solution {
    public String getHappyString(int n, int k) {
        StringBuilder res = new StringBuilder(); 
        int[] count = new int[1]; 
        
        if (helper(n, k, res, '0', count)) {
            return res.toString();
        }
        
        return "";
    }

    public boolean helper(int n, int k, StringBuilder pStr, char prev, int[] count) {
        if (pStr.length() == n) {
            count[0]++;
            if (count[0] == k) {
                return true;
            }
            return false;
        }

        char[] chars = new char[]{'a', 'b', 'c'};
        for (char ch : chars) {
            if (prev != ch) {
                pStr.append(ch);
                if (helper(n, k, pStr, ch, count)) {
                    return true;
                }
                pStr.deleteCharAt(pStr.length() - 1);
            }
        }

        return false;
    }
}
