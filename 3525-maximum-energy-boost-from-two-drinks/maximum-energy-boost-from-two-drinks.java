class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        Long[][] dp = new Long[energyDrinkA.length][2];
        long a = solve(energyDrinkA,energyDrinkB,0,0,dp);
        long b = solve(energyDrinkA,energyDrinkB,0,1,dp);
        return Math.max(a,b);
    }

    public long solve(int[] energyDrinkA,int[] energyDrinkB,int idx,int type,Long[][] dp){
        if(idx >= energyDrinkA.length){
            return 0;
        }

        if(dp[idx][type] != null) return dp[idx][type];
        long drink = type == 0 ? energyDrinkA[idx] : energyDrinkB[idx];
        long a = drink + solve(energyDrinkA,energyDrinkB,idx+1,type,dp);
        long b = drink + solve(energyDrinkA,energyDrinkB,idx+2,1-type,dp);
        return dp[idx][type] = Math.max(a,b);
    }
}