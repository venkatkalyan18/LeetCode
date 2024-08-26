class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s,ans,new ArrayList<>(),0);
        return ans;
    }

    public void helper(String s,List<List<String>> ans,List<String> list,int i){
        if(i >= s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int j =i;j<s.length();j++){
            String str = s.substring(i,j+1);
            if(isPalindrome(str)){
            list.add(str);
            helper(s,ans,list,j+1);
            list.remove(list.size()-1);
            }
        }
    }

    public boolean isPalindrome(String str){
        int l = 0;
        int r = str.length()-1;
        while(l<r){
            if(str.charAt(l++) != str.charAt(r--)){
                return false;
            }
        }

        return true;
    }
}