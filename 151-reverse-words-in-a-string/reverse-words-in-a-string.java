class Solution {
    public String reverseWords(String s) {
        String processed = "";
        String helper = "";
        int i =0 ;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                break;
            }
        }

        for(int j = i;j<s.length();j++){
            helper= "";
            while(j<s.length() && s.charAt(j) != ' ' ){
                helper+=s.charAt(j);
                j++;
            }
            if( processed.length() == 0){
                processed = helper+ processed ;
            }else if(helper.length() != 0 && processed.length() != 0) {
                processed = helper + " "+ processed ;
            }
            
        }

        return processed;
    }
}