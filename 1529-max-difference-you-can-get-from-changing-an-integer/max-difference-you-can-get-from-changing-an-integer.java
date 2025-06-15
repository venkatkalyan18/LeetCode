class Solution {
    public int maxDiff(int num) {
        String n = num + "";
        int len = n.length();
        
        StringBuilder maxi = new StringBuilder();
        StringBuilder min = new StringBuilder();
        int i = 0;
        while(i < len && n.charAt(i) == '9'){
            maxi.append('9');
            i++;
        }
        for(int j = i;j<n.length();j++){
            if(n.charAt(j) == n.charAt(i)){
                 maxi.append('9');
            }else{
                 maxi.append(n.charAt(j));
            }
        }

        i = 0;
        while(i < len && (n.charAt(i) == '1' || n.charAt(i) == '0')){
            min.append(n.charAt(i));
            i++;
        }

    
        for(int j =i;j<len;j++){
            if(n.charAt(i) == n.charAt(j)){
                if(i == 0){
                    min.append('1');
                }else{
                    min.append('0');
                }
            }else{
                min.append(n.charAt(j));
            }

        }
        

        int x = Integer.parseInt(new String(maxi));
        int y = Integer.parseInt(new String(min));

        return x - y;
    }
}