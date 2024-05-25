class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }

        for(int i : map.keySet()){
            if(map.get(i) > nums.length/2){
                return i;
            }
        }

        return -1;
    }
}