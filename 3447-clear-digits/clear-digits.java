class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        String str = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                st.add(s.charAt(i));
            } 
            else{
                if(st.isEmpty()){
                    str = str + s.charAt(i);
                }else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            str = st.pop() + str;
        }

        return str;
    }
}