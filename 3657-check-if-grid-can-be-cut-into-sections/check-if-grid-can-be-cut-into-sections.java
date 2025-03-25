class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int nr = rectangles.length;
        int[][] ver = new int[nr][2];
        int[][] hor = new int[nr][2];
        for(int i = 0;i<nr;i++){
            ver[i][0] = rectangles[i][1];
            ver[i][1] = rectangles[i][3];

            hor[i][0] = rectangles[i][0];
            hor[i][1] = rectangles[i][2];
        }

          return check(ver) || check(hor);

        
    }

    private boolean check(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int sections = 0;
        int maxEnd = intervals[0][1];

        for (int[] interval : intervals) {
            if (maxEnd <= interval[0]) {
                sections++;
            }
            maxEnd = Math.max(maxEnd, interval[1]);
        }

        return sections >= 2;
    }
}