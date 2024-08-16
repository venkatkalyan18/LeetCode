class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int maxIndex = -1, minIndex = -1;

        for (int i = 0; i < arrays.size(); i++) {
            int firstElement = arrays.get(i).get(0);
            int lastElement = arrays.get(i).get(arrays.get(i).size() - 1);

            if (lastElement > max1) {
                max2 = max1;
                max1 = lastElement;
                maxIndex = i;
            } else if (lastElement > max2) {
                max2 = lastElement;
            }

            if (firstElement < min1) {
                min2 = min1;
                min1 = firstElement;
                minIndex = i;
            } else if (firstElement < min2) {
                min2 = firstElement;
            }
        }

        if (maxIndex != minIndex) {
            return Math.abs(max1 - min1);
        } else {
            return Math.max(Math.abs(max1 - min2), Math.abs(max2 - min1));
        }
    }
}
