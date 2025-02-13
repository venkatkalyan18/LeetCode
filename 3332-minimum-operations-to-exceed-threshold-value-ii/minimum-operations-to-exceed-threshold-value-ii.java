class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i = 0;i< nums.length;i++){
            pq.add((long)nums[i]);
        }
        int count = 0;
    
        while(pq.peek() < k){
            long num1 = pq.poll();
            long num2 = pq.poll();
            pq.add(Math.min(num1,num2) * 2 + Math.max(num1,num2));
            count++;
        }

        return count;
    }
}