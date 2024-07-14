class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        Arrays.sort(nums);
        helper(nums,0,list,new ArrayList<>());
        return list;
    }

    public void helper(int[] arr,int i,List<List<Integer>> ans, List<Integer> list){
        if(arr.length <= i){
            return;
        }

        for(int j = i;j<arr.length;j++){
            if(j > i && arr[j] == arr[j-1]) continue;

            
            list.add(arr[j]);
            ans.add(new ArrayList<>(list));
            helper(arr,j+1,ans,list);
            list.remove(list.size()-1);
        }


    }
}