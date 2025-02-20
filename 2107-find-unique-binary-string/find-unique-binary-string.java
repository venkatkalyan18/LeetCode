class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();
        for(String num: nums){
            set.add(num);
        }
        return helper(set, nums.length,new StringBuilder(),0);
    }

    public String helper(Set<String> set, int n,StringBuilder currString, int currSize){
        if(n == currSize){
            if(!set.contains(currString.toString())){
                return currString.toString();
            }

            return "";
        }
        currString.append('0');
        String zero = helper(set,n,currString ,currSize + 1);
        currString.deleteCharAt(currString.length()-1);
        if(zero.length() > 0 ){
            return zero;
        }
        currString.append('1');
        String one  = helper(set,n,currString ,currSize + 1);
        currString.deleteCharAt(currString.length()-1);
        if(one.length() > 0 ){
            return one;
        }

        return "";
    }
}