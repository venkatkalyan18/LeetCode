class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n!= 0 && flowerbed.length == 1 && flowerbed[0]==0 ){
            n--;
            if(n==0){
                return true;
            }else{
                return false;
            }
        }
        if(n!=0 && flowerbed[0] != 1 && flowerbed[1] != 1){
            flowerbed[0] = 1;
            n--;
        }

        int i=1;
        while(i<flowerbed.length-1 && n!=0){
            if(flowerbed[i] != 1 && flowerbed[i-1] != 1 && flowerbed[i+1] != 1){
                flowerbed[i]=1;
                n--;
            }
            i++;
        }
        if(n != 0 && flowerbed[flowerbed.length - 1] != 1 && flowerbed[flowerbed.length - 2] != 1){
            n--;
        }
        if(n==0){
            return true;
        }
        return false;
    }
}