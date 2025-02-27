class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int res = 0;
        int n = arr.length;
        Integer[][] dp = new Integer[n][n];
        Map<Integer,Integer> set = new HashMap<>();

        for(int i = 0;i<n;i++){
            set.put(arr[i],i);
        }

        for(int i=0;i<n;i++){
            for(int j = i + 1;j<n;j++){
                res = Math.max(res,helper(arr,set,i,j,dp));
            }
        }

        if(res == 0){
            return 0;
        }
        return res + 2;
    }

    public int helper(int[] arr, Map<Integer,Integer> set,int i,int j,Integer[][] dp){
        if(arr[i] + arr[j] > arr[arr.length-1]){
            return 0;
        }

        if(dp[i][j] != null) return dp[i][j];

        int res = 0;
        if(set.containsKey(arr[i] + arr[j])){
            res = 1 + helper(arr,set,j,set.get(arr[i] + arr[j]),dp);
        }

        return dp[i][j] = res;
    }
}