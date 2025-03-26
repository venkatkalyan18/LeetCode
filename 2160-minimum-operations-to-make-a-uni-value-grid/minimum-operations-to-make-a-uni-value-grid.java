class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> values = new ArrayList<>();
        
        for (int[] row : grid) {
            for (int val : row) {
                values.add(val);
            }
        }

        Collections.sort(values);


        int median = values.get(values.size() / 2);
        int operations = 0;

        for (int val : values) {
            if(Math.abs(median - val) % x != 0){
                return -1;
            }
            operations += Math.abs(val - median) / x;
        }

        return operations;
    }
}