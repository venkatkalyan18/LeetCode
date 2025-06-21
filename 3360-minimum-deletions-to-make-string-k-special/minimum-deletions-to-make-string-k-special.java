import java.util.*;

class Solution {
    public int minimumDeletions(String w, int k) {
        // Frequency map
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : w.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Integer> freqList = new ArrayList<>(map.values());
        Collections.sort(freqList); 

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < freqList.size(); i++) {
            int minFreq = freqList.get(i);
            int deletions = 0;

            for (int j = 0; j < freqList.size(); j++) {
                int freq = freqList.get(j);
                if (freq > minFreq + k) {
                    deletions += freq - (minFreq + k); 
                } else if (freq < minFreq) {
                    deletions += freq; 
                }
            }
            res = Math.min(res, deletions);
        }

        return res;
    }
}
