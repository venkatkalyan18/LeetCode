class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        int x = nums1.length-1;
        Stack<Integer> st = new Stack<>();
        for(int i=nums2.length-1;i>=0 && x >=0;i--){
            while(!st.isEmpty() && nums2[i] >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}