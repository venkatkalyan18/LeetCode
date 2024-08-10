import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else if (ch == ')') {
                if (!st.isEmpty()) {
                    st.pop();  
                } else {
                    sb.deleteCharAt(i); 
                    i--;  
                }
            }
        }

        while (!st.isEmpty()) {
            sb.deleteCharAt(st.pop());
        }
        
        return sb.toString();
    }
}
