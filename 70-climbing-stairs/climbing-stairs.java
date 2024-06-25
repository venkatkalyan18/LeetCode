class Solution {
    public int climbStairs(int n) {
        return stairs(n,new HashMap<>());
    }

    public int stairs(int n,HashMap<Integer,Integer> map){
        if(n < 4){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
    
        map.put(n,stairs(n-1,map) + stairs(n-2,map));
        return map.get(n);
    }
}