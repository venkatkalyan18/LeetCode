class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int i=0;
     StringBuilder sb=new StringBuilder();
        while(i<chars.length){
            char sy = chars[i];
            int count = 0;
            while(i<chars.length && sy == chars[i] ){
                i++;
                count++;
            }
            if(count==1){
                sb.append(sy);
            }else{
                sb.append(sy);
                sb.append(count);
            }
                
        }
        System.out.print(sb);
       char[] compressedChars = sb.toString().toCharArray();
        System.arraycopy(compressedChars, 0, chars, 0, compressedChars.length);
        return sb.length();
    }
}