class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> boolList = new ArrayList<>();
        int largest = 0;
        for(int i = 0; i<candies.length;i++){
            if(largest < candies[i]){
                largest = candies[i];
            }
        }
        for(int i =0 ;i<candies.length;i++){
            if(candies[i]+ extraCandies < largest){
                boolList.add(false);
            }else{
                boolList.add(true);
            }
        }
        return boolList;
    }
}