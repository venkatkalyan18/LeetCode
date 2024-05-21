class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
                int i = 0;
        while(i<asteroids.length){
             if (asteroids[i] > 0 || st.isEmpty()) {
                st.push(asteroids[i]);
            } else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }

                if(!st.isEmpty() && st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                }else{
                     if(st.isEmpty() || st.peek() < 0){
                        st.push(asteroids[i]);
                     }
                    
                    
                }

            }
            i++;
        }

        int[] arr = new int[st.size()];
        i = st.size()-1;
        while(!st.isEmpty()){
            arr[i--] = st.pop();
        }

        return arr;

    }
}