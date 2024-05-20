class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> row = new HashMap<>();
        HashMap<String,Integer> col = new HashMap<>();
        int ans = 0;

        for(int i=0;i<grid.length;i++){
            String str = "";
            for(int j =0;j<grid[0].length;j++){
                str = str + grid[i][j] + "_";
            }

            if(!row.containsKey(str)){
                row.put(str,1);
            }else{
                row.put(str,row.get(str)+1);
            }
        }

        for(int i=0;i<grid.length;i++){
            String str = "";
            for(int j =0;j<grid[0].length;j++){
                str = str + grid[j][i] + "_";
            }

            if(!col.containsKey(str)){
                col.put(str,1);
            }else{
                col.put(str,col.get(str)+1);
            }
        }


        for(Map.Entry<String,Integer> entry : row.entrySet()){
            if(col.containsKey(entry.getKey())){
                ans = ans + (entry.getValue() * col.get(entry.getKey()));
            }
        }

        return ans;
    }
}