class Solution {
    public String[] divideString(String s, int k, char fill) {
        while(s.length() % k != 0){
            s = s + fill;
        }
        String[] res = new String[(s.length()/k)];
        int x = 0;

        for(int i=0;i<=s.length()-k;i+=k){
            String temp = s.substring(i,i+k);
            res[x++] = temp;
        }

        return res;

    }
}