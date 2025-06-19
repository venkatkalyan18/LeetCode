import java.util.Arrays;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(position[i], (double)(target - position[i]) / speed[i]);
        }
        Arrays.sort(pairs, (a, b) -> a.pos - b.pos);
        int res = 1;
        double max = pairs[n-1].time;
        for (int i = n - 2; i >= 0; i--) {
            if (pairs[i].time > max) {
                res++;
                max = pairs[i].time;
            }

            max = Math.max(max,pairs[i].time);
        }

        return res;
    }

    class Pair {
        int pos;
        double time;

        Pair(int pos, double time) {
            this.pos = pos;
            this.time = time;
        }
    }
}
