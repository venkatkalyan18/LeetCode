class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int numDays = 0;
        int largest = meetings[0][1];
        for(int i=0;i<meetings.length-1;i++){
            if(largest < meetings[i+1][0]){
                numDays+=(meetings[i+1][0] - largest -1);
            }

            largest = Math.max(largest,meetings[i+1][1]);
        }

            numDays+=(days - largest);
            numDays+=(meetings[0][0] - 1);
          
        return numDays;
    }
}