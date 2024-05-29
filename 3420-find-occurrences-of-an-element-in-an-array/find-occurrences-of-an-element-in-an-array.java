class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int occurrences[] = new int[nums.length];
        int ans[] = new int[queries.length];
        Arrays.fill(occurrences,-1);
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == x){
                occurrences[count++] = i;
            }
        }

        for(int i=0;i<queries.length;i++){
            if(nums.length >= queries[i] && queries[i] <= count && occurrences[queries[i]-1] != -1){
                ans[i] = occurrences[queries[i]-1];
            }else{
                ans[i] = -1;
            }
        }

        return ans;

    }
}