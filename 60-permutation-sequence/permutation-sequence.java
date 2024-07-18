class Solution {

    String ans = "";
    int m = 1;
    public String getPermutation(int n, int k) {
        helper(n,k,"",new boolean[n]);
        return ans;
    }

    public void helper(int n,int k,String p,boolean[] flag){

        if(m > k){
            return;
        }

        if(p.length() == n){
            if(m == k){
                ans = p;
            }
            m++;
            return;
        }

        for(int i=1;i<=n;i++){
            if(flag[i-1] == false){
                flag[i-1] = true;
                helper(n,k,p+i,flag);
                flag[i-1] = false;
            }
        }
    }
}