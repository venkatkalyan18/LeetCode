class Solution {
    public int areaOfMaxDiagonal(int[][] dim) {
        int maxArea = 0;
        double maxDiag = 0;

        for (int[] d : dim) {
            int length = d[0];
            int width = d[1];
            int area = length * width;
            double diagonal = length * length + width * width;

            if (diagonal > maxDiag) {
                maxDiag = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiag) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
