class Solution {
    public boolean swapped(StringBuilder s) {
        boolean swappedFlag = false;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                s.setCharAt(i, '1');
                s.setCharAt(i + 1, '0');
                swappedFlag = true;
                i++;
            }
        }
        return swappedFlag;
    }

    public int secondsToRemoveOccurrences(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        while (swapped(sb)) {
            count++;
        }
        return count;
    }
}