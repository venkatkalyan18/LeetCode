class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        helper(s,0,list,"");
        return list;
    }

    public void helper(String s,int i,List<String> list,String p){
        if(s.length() == i){
            list.add(p);
            return;
        }

        if(Character.isDigit(s.charAt(i))){
            helper(s,i+1,list,p+s.charAt(i));
        }else{
            helper(s,i+1,list,p+Character.toLowerCase(s.charAt(i)));
            helper(s,i+1,list,p+Character.toUpperCase(s.charAt(i)));
        }
    }
}