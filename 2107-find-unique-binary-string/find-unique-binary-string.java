class Solution {

    boolean isNum = false;
    String res  = "";
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();
         for(String num : nums){
            set.add(num);
        }
        helper(set,"",nums[0].length());
        return res;
    }

    public void helper(Set<String> set,String p,int n){
        if(p.length() == n){
            if(!set.contains(p)){
                isNum = true;
                res = p;
            }
            return ;
        }
        if(!isNum){
            helper(set,p+"0",n);
            helper(set,p+"1",n);
        }
    }
}