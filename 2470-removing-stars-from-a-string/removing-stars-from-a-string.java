class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '*'){
                st.push(s.charAt(i));
            }else{
                st.pop();
            }
        }

        while(!st.isEmpty()){
            ans  = st.pop() + ans; 
        }

        return ans;

        
    }
}