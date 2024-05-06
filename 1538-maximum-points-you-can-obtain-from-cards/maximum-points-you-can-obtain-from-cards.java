class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum =0;
        int maxSum = 0;
        int last = cardPoints.length -1;
        for(int i = 0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxSum = sum;

        for(int i=k-1;i>=0;i--){
            sum = sum - cardPoints[i] + cardPoints[last];
            maxSum = Math.max(sum,maxSum);
            last--;
        }

        return maxSum;
    }
}