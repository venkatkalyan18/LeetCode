class Solution {
    public int maxDistance(String x, int k) {
        int max = 0;
        int n=0,s=0,e=0,w=0;
        for(int i=0;i<x.length();i++){
            char ch =  x.charAt(i);
            if(ch =='N'){
                n++;
            }else if(ch == 'S'){
                s++;
            }else if(ch == 'E'){
                e++;
            }else {
                w++;
            }
            int md = Math.abs(n-s) + Math.abs(w-e);
            int wasted = (i+1) - md;
            int curr = Math.min(2*k,wasted) + md;
            max = Math.max(max,curr);
        }

        return max;
    }
}