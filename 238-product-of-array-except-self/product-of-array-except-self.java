class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        int l = 1;
        int r = 1;
        for(int i=0;i<nums.length;i++){
            l *= nums[i];
            r *= nums[nums.length - 1 -i];

            left[i] = l;
            right[nums.length-1-i] = r;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(right[i]);
        }

        nums[nums.length-1] = left[left.length-2];
        nums[0] = right[1];
        for(int i=1;i<nums.length-1;i++){
            nums[i] = left[i-1] * right[i+1];
        }

        return nums;

    }
}