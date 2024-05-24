import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (list.size() == 0 || list.get(list.size() - 1).get(1) < intervals[i][0]) {
                list.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                int newEnd = Math.max(list.get(list.size() - 1).get(1), intervals[i][1]);
                list.get(list.size() - 1).set(1, newEnd);
            }
        }
        
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        
        return ans;
    }
}