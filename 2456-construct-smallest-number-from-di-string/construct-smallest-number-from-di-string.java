class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder res = new StringBuilder();
        boolean[] isUsed = new boolean[10];

        for (int i = 1; i <= 9; i++) {
            res.append(i);
            isUsed[i] = true;
            if (helper(pattern, 0, isUsed, res)) {
                break;
            }
            isUsed = new boolean[10]; // Reset isUsed array
            res = new StringBuilder(); // Reset res
        }
        return res.toString();
    }

    public boolean helper(String pattern, int idx, boolean[] isUsed, StringBuilder pStr) {
        if (idx == pattern.length()) return true;

        for (int i = 1; i < 10; i++) {
            if (!isUsed[i] && 
                ((pattern.charAt(idx) == 'I' && i > (pStr.charAt(pStr.length() - 1) - '0')) || 
                 (pattern.charAt(idx) == 'D' && i < (pStr.charAt(pStr.length() - 1) - '0')))) {
                
                isUsed[i] = true;
                pStr.append(i);
                
                if (helper(pattern, idx + 1, isUsed, pStr)) {
                    return true;
                }
                
                pStr.deleteCharAt(pStr.length() - 1); 
                isUsed[i] = false;
            }
        }
        return false;
    }
}
