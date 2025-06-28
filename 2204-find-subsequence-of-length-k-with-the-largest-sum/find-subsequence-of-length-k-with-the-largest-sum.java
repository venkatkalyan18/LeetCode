class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{i,nums[i]});
            while(pq.size() > k){
                pq.poll();
            }
        }
        int[][] temp = new int[k][2];
        int x=0;
        while(!pq.isEmpty()){
            temp[x][0] = pq.peek()[0];
            temp[x][1] = pq.peek()[1];
            pq.poll();
            x++;
        }
        Arrays.sort(temp,(a,b) -> a[0] - b[0]);
        for(int i=0;i<k;i++){
            res[i] = temp[i][1];
        }
        return res;
    }
}