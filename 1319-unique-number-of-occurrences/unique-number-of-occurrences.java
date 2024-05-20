class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();

        for(int i: arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }

        for(int i : map.keySet()){
            if(set.contains(map.get(i))){
                return false;
            }else{
                set.add(map.get(i));
            }
        }

        return true;
    }
}