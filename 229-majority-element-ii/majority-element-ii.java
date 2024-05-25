class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int num1 = Integer.MIN_VALUE;
        int count1 = 0;
        int num2 =  Integer.MIN_VALUE;
        int count2 = 0;

        for(int i=0;i<nums.length;i++){
            if(count1 == 0 && nums[i] != num2){
                num1 = nums[i];
                count1 = 1;
            }else if(count2 == 0 && nums[i]!=num1){
                num2 = nums[i];
                count2 = 1;
            }else if(num1 == nums[i]){
                count1++;
            }else if(num2 == nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i=0;i<nums.length;i++){
            if(num1 == nums[i]){
                count1++;
            }
            if(num2 == nums[i]){
                count2++;
            }
        }

        if(count1 > nums.length/3){
            ans.add(num1);
        }

        if(count2 > nums.length/3){
            ans.add(num2);
        }
        
        return ans;
    }
}