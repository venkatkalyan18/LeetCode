class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] isVisited = new boolean[n];
        int res = 0;
        for(int i =0;i<n;i++){
            if(!isVisited[i]){
                if(bfs(adj,i,isVisited)){
                    res++;
                }
            }
        }

        return res;
    }

    public boolean bfs(List<List<Integer>> adj,int node, boolean[] isVisited){
        isVisited[node] = true;
        if(adj.get(node).size() == 0) return true;
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        int count = 0;
        int noOfNodes = 0;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i =0;i<n;i++){
                int next = q.poll();
                noOfNodes++;
                for(int e : adj.get(next)){
                    count++;
                    if(!isVisited[e]){
                        isVisited[e] = true;
                        q.add(e);
                    }
                }
            }
        }
        if(count / 2 == (noOfNodes * (noOfNodes - 1) / 2)){
            return true;
        }

        return false;
    }
}