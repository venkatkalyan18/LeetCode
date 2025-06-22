class Solution {
    public String[] divideString(String s, int k, char fill) {
        while(s.length() % k != 0){
            s = s + fill;
        }
        System.out.println(s);
        String[] res = new String[(s.length()/k)];
        int x = 0;

        for(int i=0;i<=s.length()-k;i+=k){
            String temp = "";
            for(int j=i;j<i+k;j++){
                temp = temp + s.charAt(j) + "";
            }
           
            res[x++] = temp;
        }

        return res;

    }
}