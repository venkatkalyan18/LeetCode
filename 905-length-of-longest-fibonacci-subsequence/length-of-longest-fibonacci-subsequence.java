class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }

        for(int i= 0;i<arr.length;i++){
            
            for(int j =i+1;j<arr.length;j++){
                int prev1 = arr[i];
                int prev2 = arr[j];
                int curr = prev1 + prev2;
                int currRes = 0;

                while(curr <= arr[arr.length - 1] && set.contains(curr)){
                    currRes++;
                    prev1 = prev2;
                    prev2 = curr;
                    curr = prev1 + prev2;
                }

                if(currRes != 0){
                    res = Math.max(res,currRes + 2);
                }
                
            }
            
        }

        return res;
    }
}