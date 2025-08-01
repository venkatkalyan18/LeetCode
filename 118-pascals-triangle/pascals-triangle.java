class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            li.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    li.get(i).add(1);
                }else{
                    li.get(i).add(li.get(i-1).get(j-1) + li.get(i-1).get(j));
                }
            }
        }
        return li;
    }
}