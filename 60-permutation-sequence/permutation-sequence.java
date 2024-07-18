class Solution {

    int m = 1;
    public String getPermutation(int n, int k) {
        String ans = helper(n,k,"",new boolean[n]);
        return ans;
    }

    public String helper(int n,int k,String p,boolean[] flag){


        if(p.length() == n){
            if(m == k){
                return p;
            }
            m++;
            return "";
        }

        for(int i=1;i<=n;i++){
            if(flag[i-1] == false){
                flag[i-1] = true;
                String str = helper(n,k,p+i,flag);
                if(str.length() != 0){
                    return str;
                }
                flag[i-1] = false;
            }
        }

        return "";
    }
}