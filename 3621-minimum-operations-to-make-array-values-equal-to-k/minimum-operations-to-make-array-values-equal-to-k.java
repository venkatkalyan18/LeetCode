class Solution {
    public int minOperations(int[] nums, int k) {
        int res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            if(!s.contains(i)){
                            pq.add(i);
                            s.add(i);
            }

        }

        int maxi = pq.poll();;
        while(!pq.isEmpty()){
            int temp = pq.poll();
            maxi = temp;
            res++;
        }

        if(maxi == k){
            return res;
        }
        System.out.println(maxi);
        if(k < maxi){
            return res+1;
        }

        return -1;
    }
}