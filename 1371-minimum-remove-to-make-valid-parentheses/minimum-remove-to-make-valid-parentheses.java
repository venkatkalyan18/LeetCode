import java.util.Stack;

class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < n; i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else if (ch == ')') {
                if (st.isEmpty()) {
                    sb.deleteCharAt(i);
                    i--;  // Adjust the index after deletion
                    n--;  // Adjust the length after deletion
                } else {
                    st.pop();
                }
            }
        }
        
        // Remove any unmatched '(' left in the stack
        while (!st.isEmpty()) {
            sb.deleteCharAt(st.pop());
        }
        
        return sb.toString();
    }
}
