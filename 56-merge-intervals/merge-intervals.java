import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // List to hold merged intervals
        List<List<Integer>> list = new ArrayList<>();
        
        // Iterate over intervals and merge them
        for (int i = 0; i < intervals.length; i++) {
            // If list is empty or current interval does not overlap with the last one
            if (list.size() == 0 || list.get(list.size() - 1).get(1) < intervals[i][0]) {
                list.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                // Update the end time of the last interval in the list
                int newEnd = Math.max(list.get(list.size() - 1).get(1), intervals[i][1]);
                list.get(list.size() - 1).set(1, newEnd);
            }
        }
        
        // Convert list of merged intervals back to array
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        
        return ans;
    }
}