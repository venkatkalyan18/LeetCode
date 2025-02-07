class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int curr = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> set = new HashMap<>();
        int[] arr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int ball = queries[i][0];
            int color = queries[i][1];
            if(map.containsKey(ball)){
                int prevColor = map.get(ball);
                set.put(prevColor, set.get(prevColor) - 1);
                if(set.get(prevColor) <= 0) {
                    curr--;
                }
                if(set.getOrDefault(color,0) == 0){
                    curr++;
                }
                set.put(color,set.getOrDefault(color,0) + 1);
            }else{
                if(set.getOrDefault(color,0) == 0){
                    curr++;
                }
                set.put(color,set.getOrDefault(color,0) + 1);
            }
            arr[i] = curr;
            map.put(ball,color);
        }

        return arr;
    } 
}