class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int left = 0;
        int right =1;
        while(left< right && right < prices.length){
            int profit = prices[right]  - prices[left];
            ans = Math.max(ans,profit);
            if(prices[left] > prices[right]){
                left = right ;
                right++;
            }else{
                right++;
            }
        }
        return ans;
    }
}