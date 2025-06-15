class Solution {
    public int maxDiff(int num) {
        String n = num + "";
        int len = n.length();
        String maxi = "";
        String min = "";
        int i = 0;
        while(i < len && n.charAt(i) == '9'){
            maxi += '9';
            i++;
        }
        for(int j = i;j<n.length();j++){
            if(n.charAt(j) == n.charAt(i)){
                maxi += '9';
            }else{
                maxi += n.charAt(j);
            }
        }

        i = 0;
        while(i < len && (n.charAt(i) == '1' || n.charAt(i) == '0')){
            min += n.charAt(i);
            i++;
        }

    
        for(int j =i;j<len;j++){
            if(n.charAt(i) == n.charAt(j)){
                if(i == 0){
                    min += '1';
                }else{
                    min += '0';
                }
            }else{
                min += n.charAt(j);
            }

        }
        

        int x = Integer.parseInt(maxi);
        int y = Integer.parseInt(min);

        return x - y;




    }
}