class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        List<Pair> li = new ArrayList<>();
        for(int i=0;i<x.length;i++){
            li.add(new Pair(x[i],y[i]));
        }
        Collections.sort(li,(a,b) -> b.y - a.y);
        int count = 1;
        int sum = li.get(0).y;
        int[] set = new int[4];
        set[0] = li.get(0).x;
        for(int i=1;i<li.size() && count < 3;i++){
            while(i < li.size() && (set[0] == li.get(i).x || set[1] == li.get(i).x)){
                i++;
            }
            if(li.size() == i){
                return -1;
            }
            set[count] = li.get(i).x;
            count++;
            sum += li.get(i).y;
        }
        if(count != 3){
            return -1;
        }
        return sum;
    }

    class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}