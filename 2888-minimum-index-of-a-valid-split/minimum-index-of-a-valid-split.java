import java.util.List;

class Solution {
    public int minimumIndex(List<Integer> nums) {
        int ele = nums.get(0);
        int count = 1;
        
        for (int i = 1; i < nums.size(); i++) { 
            if (nums.get(i) == ele) {
                count++;
            } else {
                count--;
            }
            
            if (count < 0) {
                ele = nums.get(i);
                count = 1;
            }
        }

        int totalCount = 0;
        for (int i : nums) {
            if (ele == i) {
                totalCount++;
            }
        }

        int currCount = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == ele) {
                currCount++;
            }

            if (currCount > (i + 1) / 2 && totalCount - currCount > (nums.size() - (i + 1)) / 2) {
                return i;
            }
        }

        return -1;
    }
}
