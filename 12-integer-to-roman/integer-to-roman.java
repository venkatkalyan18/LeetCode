class Solution {
    public String intToRoman(int num) {
       HashMap<Integer, String> map = new HashMap<>();
map.put(1, "I");
map.put(5, "V");
map.put(10, "X");
map.put(50, "L");
map.put(100, "C");
map.put(500, "D");
map.put(1000, "M");
map.put(4, "IV");
map.put(9, "IX");
map.put(40, "XL");
map.put(90, "XC");
map.put(400, "CD");
map.put(900, "CM");

        int[] arr = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String str = num + "";
        String ans = "";
        for(int i=0;i<str.length();i++){
            String num1 = str.charAt(i) + "";
            for(int j=i;j<str.length()-1;j++){
                num1 +='0';
            }
            int n = Integer.parseInt(num1);
            if(map.containsKey(n)){
                ans+=map.get(n);
            }else{
                ans += getRoman(n,arr,map);
            }
        }
        return ans;
    }

    public String getRoman(int n,int[] arr,HashMap<Integer,String> map){
        String ans = "";
        int i = 0;
        while(n > 0){
            while(n> 0 && arr[i] <= n){
                n-=arr[i];
                ans+=map.get(arr[i]);
            }
            i++;
        }
        return ans;
    }
}