class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer>  q = new ArrayDeque<>();
        int x = 0;
        for(int right = 0;right < n;right++){
            while(!q.isEmpty() && q.peekLast() < nums[right]){
                q.removeLast();
            }

            q.addLast(nums[right]);

            if(right - left + 1 == k){
                res[x++] = q.peekFirst();
                if(q.peekFirst() == nums[left]){
                    q.removeFirst();
                }

                left++;
            }
            
        }

        return res;
    }
}