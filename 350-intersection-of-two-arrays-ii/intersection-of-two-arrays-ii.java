class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int i : nums2){
            if(!map2.containsKey(i)){
                map2.put(i,1);
            }else{
                map2.put(i,map2.get(i)+1);
            }
        }

        for(int i : nums1){
            if(map2.containsKey(i) && map2.get(i) > 0){
                list.add(i);
                map2.put(i,map2.get(i)-1);
            }
        }

        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        
        return result;
    }
}