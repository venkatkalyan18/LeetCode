class Solution {
    public int totalFruit(int[] fruits) {
        int res = 0;
        int[] nums = new int[2];
        int[] numIdx = new int[2];
        Arrays.fill(numIdx,-1);
        int left = 0;
        for(int i=0;i<fruits.length;i++){
            if(numIdx[0] == -1){
                nums[0] = fruits[i];
            }else if(numIdx[1] == -1){
                nums[1] = fruits[i];
            }else if(nums[0] != fruits[i] && nums[1] != fruits[i]){
                if(numIdx[0] < numIdx[1]){
                    left = numIdx[0] + 1;
                    nums[0] = fruits[i];
                }else{
                    left = numIdx[1] + 1;
                    nums[1] = fruits[i];
                }
            }

            if(nums[0] == fruits[i]){
                numIdx[0] = i;
            }else if(nums[1] == fruits[i]){
                numIdx[1] = i;
            }

            res = Math.max(res,i - left + 1);
        }

        return res;
    }
}