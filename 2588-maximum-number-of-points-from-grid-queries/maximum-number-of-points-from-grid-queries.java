class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int n = queries.length;
        PriorityQueue<Pair2> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.value,b.value));
        Pair[] q = new Pair[n];
        int[] res = new int[n];
        boolean[][] isVis = new boolean[grid.length][grid[0].length];
        int[][] directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};

        for(int i =0;i<queries.length;i++){
            q[i] = new Pair(i,queries[i]);
        }

        Arrays.sort(q, (a,b) -> (
            Integer.compare(a.value,b.value))
        );

        pq.add(new Pair2(grid[0][0],0,0));
        isVis[0][0] = true;

        int x = 0;
        int count = 0;

        while(!pq.isEmpty() && x < n){
            while(x < n && pq.peek().value >= q[x].value){
                res[q[x].idx] = count;
                x++;
            }

            Pair2 temp = pq.poll();
            count++;

            for(int[] direction : directions){
                int row = temp.row + direction[0];
                int col = temp.col + direction[1];

                if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || isVis[row][col]){
                    continue;
                }

                pq.add(new Pair2(grid[row][col],row,col));
                isVis[row][col] = true;
            }
        }
        while (x < n) {
            res[q[x].idx] = count;
            x++;
        }
        return res;
        
    }


    class Pair{
        int idx;
        int value;

        Pair(int idx, int value){
            this.idx = idx;
            this.value = value;
        }
    }

    class Pair2{
        int value;
        int row;
        int col;

        Pair2(int value, int row, int col){
            this.value = value;
            this.row  = row;
            this.col = col;
        }
    }
}