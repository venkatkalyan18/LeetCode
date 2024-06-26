class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) {
            return new int[][] { newInterval };
        }
        List<int[]> list = new ArrayList<>();
        int i=0;
        while(i<intervals.length && newInterval[0] > intervals[i][0]){
            list.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }

         if (!list.isEmpty() && list.get(list.size() - 1)[1] >= newInterval[0]) {
            // Merge newInterval with the last interval in list
            list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], newInterval[1]);
        } else {
            // Add newInterval if it doesn't overlap
            list.add(newInterval);
        
        }
        while (i < intervals.length) {
            int[] currentInterval = intervals[i];
            if (list.get(list.size() - 1)[1] >= currentInterval[0]) {
                // Merge if there is overlap
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], currentInterval[1]);
            } else {
                // No overlap, add the interval
                list.add(currentInterval);
            }
            i++;
        }


        return list.toArray(new int[list.size()][]);


    }
}