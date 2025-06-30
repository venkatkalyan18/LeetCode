import java.util.Arrays;

class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1_000_000_007;
        int res = 0;
        int n = nums.length;

        int[] pow2 = new int[n];
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }

        for (int i = 0; i < n; i++) {
            int t = target - nums[i];
            int left = i, right = n - 1, idx = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] + nums[i] <= target) {
                    idx = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (idx >= i) {
                res = (res + pow2[idx - i]) % mod;
            }
        }

        return res;
    }
}
