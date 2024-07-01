class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int k = 0;
            while(i<arr.length && arr[i] % 2 != 0 && k<=3){
                i++;
                k++;
            }

            if(k >= 3){
                return true;
            }

            i++;
        }

        return false;
    }
}