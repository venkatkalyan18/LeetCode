class Solution {

    class Pair{
        int start;
        int end;
        int profit;

        Pair(int start, int end, int profit){
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        List<Pair> li = new ArrayList<>();
        for(int i=0;i<startTime.length;i++){
            li.add(new Pair(startTime[i],endTime[i],profit[i]));
        }
        Collections.sort(li,(a,b) -> a.start - b.start);
        return helper(li,0,new Integer[startTime.length]);
    }

    public int helper(List<Pair> li, int i,Integer[] dp){
        if(i >= li.size() || i == -1){
            return 0;
        }

        if(dp[i] != null){
            return dp[i];
        }

        int notTake = helper(li,i+1,dp);
        int nextIdx = getNextIdx(li,li.get(i).end);
        int take = li.get(i).profit + helper(li,nextIdx,dp);

        return dp[i] = Math.max(take, notTake);
    }

    public  int getNextIdx(List<Pair> li, int ele){
        int left = 0;
        int right = li.size()-1;
        int res = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(li.get(mid).start >= ele){
                res = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return res;
    }
}