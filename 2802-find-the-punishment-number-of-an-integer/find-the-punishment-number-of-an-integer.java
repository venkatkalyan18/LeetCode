class Solution {
    public int punishmentNumber(int n) {
        int res = 0;
        for(int i=0;i<=n;i++){
            if(helper(i*i + "",i,0)){
                res += (i* i);
            }
        }

        return res;
    }

    public boolean helper(String num,int target,int idx){
        if(idx == num.length()) return target == 0;
        int sum = 0;
        for(int i=idx;i<num.length();i++){
            sum = sum * 10 + (num.charAt(i) - '0');
            if(sum > target) break;
            if(helper(num, target - sum, i+1)){
                return true;
            }
        }

        return false;
    }
}

