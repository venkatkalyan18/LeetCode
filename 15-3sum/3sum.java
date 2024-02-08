class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set =new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
             Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            Set<Integer> map=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int sum=-(nums[i]+nums[j]);
                if(map.contains(sum)){
                     List<Integer> num=new ArrayList<>();
                     num.add(nums[i]);
                     num.add(nums[j]);
                     num.add(sum);
                
                    set.add(num);
                }else{
                    map.add(nums[j]);
                }
            }
        }

ans.addAll(set);
return ans;
}
}