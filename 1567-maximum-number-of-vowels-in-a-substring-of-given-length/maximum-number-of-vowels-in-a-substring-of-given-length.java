class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int count =0;
        String vowels = "aeiou";
        for(int i=0;i<k;i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                count++;
            }
        }
        ans = count;
        for(int i=k;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i-k)) !=-1){
                count--;
            }
            if(vowels.indexOf(s.charAt(i))!=-1){
                count++;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}