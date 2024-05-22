class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        int k = 0;
        for(int i=0;i<3;i++){
            if(map.containsKey(i)){
                for(int j =0;j<map.get(i);j++){
                nums[k++] = i;
            }
            } 
        }
    }
}