class Solution {
    public double myPow(double x, int n) {
        double num = 1;
        long nn = n;
        if(nn < 0) nn = -nn;

        while(nn > 0){
            if(nn%2 == 0){
                x = x*x;
                nn/=2;
            }else{
                num = num * x;
                nn--;
            }
        }

        if(n<0){
            num = 1.0/num;
        }

        return num;
    
    }
}