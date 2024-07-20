class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int i=0;i<weights.length;i++){
            left = Math.max(left,weights[i]);
            right+=weights[i];
        }

        int ans = Integer.MAX_VALUE;

        while(left <= right){
            int mid = (left + right) / 2;
            int day = 1;
            int weight = 0;
           for(int i=0;i<weights.length;i++){
                if(weight + weights[i] <= mid){
                    weight += weights[i];
                }else{
                    day++;
                    weight = weights[i];
                }
            }

            if(day <= days){
                ans = Math.min(ans,mid);
                right = mid -1  ;
            }else{
                left = mid + 1;
            }
        }

        return ans;
    }
}