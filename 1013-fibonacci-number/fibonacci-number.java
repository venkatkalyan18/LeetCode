class Solution {
    public int fib(int n) {
       if(n == 0 || n == 1){
        return n;
       }

       int prev = 0;
       int curr = 1;
       for(int i = 0 ;i<n-1;i++){
        int next = curr + prev;
        prev = curr;
        curr = next;
       }

       return curr;
    }
}