class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while(i<name.length() && j<typed.length()){
            char ch = name.charAt(i);
            int n = 0;
            while(i<name.length() && ch == name.charAt(i)){
                n++;
                i++;
            }

            while(j< typed.length() && ch == typed.charAt(j)){
                n--;
                j++;
            }

            if(n>0){
                return false;
            }
        }

        if(i<name.length()){
            return false;
        }

        if(j< typed.length()){
            return false;
        }

        return true;
    }
}