class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            right = Math.max(right,piles[i]);
        }

        int ans = right;

        while(left <= right){
            int mid = left + (right - left ) / 2;
            long maxHours = 0;
            
            for(int i=0;i<piles.length;i++){
                maxHours += Math.ceil(((double)piles[i]/(double)mid));
                if(maxHours > h){
                    break;
                }
            }


            if(maxHours <= h ){
                ans = Math.min(ans,mid);
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return  ans;
    }
}