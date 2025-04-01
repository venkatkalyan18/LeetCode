class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length+1];
        for(int i = questions.length - 1 ;i >= 0;i--){
            long take = questions[i][0];
            if(i + questions[i][1] + 1 < questions.length){
                take += dp[i+questions[i][1]+1];
            }
            long notTake =  dp[i+1];
            dp[i] = Math.max(take,notTake);
        }

        return dp[0];
    }

    public long helper(int[][] ques,int i){
        if(i >= ques.length){
            return 0;
        }

        long take = ques[i][0] + helper(ques,i + ques[i][1] + 1);
        long notTake =  helper(ques,i+1);

        return Math.max(take,notTake);
    }
}