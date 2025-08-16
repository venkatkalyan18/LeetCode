class Solution {
    public int maximum69Number (int num) {
        String str = num + "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '6'){
                str = str.substring(0,i) + '9' + str.substring(i+1);
                break;
            }
        }

        return Integer.parseInt(str);
    }
}