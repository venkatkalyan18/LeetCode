class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        int idx1 = -1, idx2 = -1, idx3 = -1;

        for (int i = 0; i < x.length; i++) {
            if (idx1 == -1) {
                idx1 = i;
            } else if (x[i] == x[idx1]) {
                if (y[i] > y[idx1]) {
                    idx1 = i;
                }
            } else if (idx2 == -1) {
                idx2 = i;
            } else if (x[i] == x[idx2]) {
                if (y[i] > y[idx2]) {
                    idx2 = i;
                }
            } else if (idx3 == -1) {
                idx3 = i;
            } else if (x[i] == x[idx3]) {
                if (y[i] > y[idx3]) {
                    idx3 = i;
                }
            } else {
                int minY = Math.min(y[idx1], Math.min(y[idx2], y[idx3]));
                if (y[i] > minY) {
                    if (y[idx1] == minY) {
                        idx1 = i;
                    } else if (y[idx2] == minY) {
                        idx2 = i;
                    } else {
                        idx3 = i;
                    }
                }
            }
        }

        if (idx1 == -1 || idx2 == -1 || idx3 == -1) {
            return -1;
        }

        return y[idx1] + y[idx2] + y[idx3];
    }
}