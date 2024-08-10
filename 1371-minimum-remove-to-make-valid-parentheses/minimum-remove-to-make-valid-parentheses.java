import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        
        // First pass: Identify invalid parentheses
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else if (ch == ')') {
                if (!st.isEmpty()) {
                    st.pop();  // Valid match, pop from the stack
                } else {
                    sb.deleteCharAt(i);  // No match for ')', so remove it
                    i--;  // Adjust the index after deletion
                }
            }
        }
        
        // Second pass: Remove unmatched '('
        while (!st.isEmpty()) {
            sb.deleteCharAt(st.pop());
        }
        
        return sb.toString();
    }
}
