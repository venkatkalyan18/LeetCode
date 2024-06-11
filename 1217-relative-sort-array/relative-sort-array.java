class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
            }else{
                map.put(arr1[i],map.get(arr1[i])+1);
            }
        }
        int k = 0;
        for(int i:arr2){
            while(map.get(i) > 0){
                arr1[k++] = i;
                map.put(i,map.get(i)-1);
            }
            map.remove(i);
        }

        List<Integer> list = new ArrayList<>();

        for(int i :map.keySet()){
            while(map.get(i) > 0){
                list.add(i);
                map.put(i,map.get(i)-1);
            }
        }
         Collections.sort(list);

        for(int i=0;i<list.size();i++){
            arr1[k++] = list.get(i);
        }

        return arr1;
    }
}