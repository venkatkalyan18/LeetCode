class Solution {
    public String simplifyPath(String path) {
        Stack<String> s =new Stack<>();
        String res;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='/'){
                continue;
            }
            String temp=new String("");
            while(i<path.length() && path.charAt(i)!='/'){
                temp=temp+path.charAt(i);
                i++;
            }
            if(temp.equals(".") ){
                continue;         
            }
            else if(temp.equals(".."))
            { if(s.size()>0){
                    s.pop();
                }
                
            }
            else{
                s.push(temp);
            }
        }
        String ans= new String("");
        while(!s.isEmpty()){
            ans="/"+s.pop()+ans;             
        }
        if(ans.equals("")){
            ans="/";
        }
        return ans;
    }
}