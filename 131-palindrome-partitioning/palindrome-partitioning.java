class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s,0,new ArrayList<>(),ans);
        return ans;
    }

    public void helper(String s,int index,List<String> ps,List<List<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList<>(ps));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                ps.add(s.substring(index,i+1));
                helper(s,i+1,ps,ans);
                ps.remove(ps.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s,int left,int right){
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }

        return true;
    }
}