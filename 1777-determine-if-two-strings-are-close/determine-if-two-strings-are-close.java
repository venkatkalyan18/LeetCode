class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();


        for(int k=0;k<word1.length();k++){
            char i = word1.charAt(k);
            if(!map1.containsKey(i)){
                map1.put(i,1);
            }else{
                map1.put(i,map1.get(i)+1);
            }
        }

        for(int k=0;k<word2.length();k++){
            char i = word2.charAt(k);
            if(!map1.containsKey(i)){
                return false;
            }

            if(!map2.containsKey(i)){
                map2.put(i,1);
            }else{
                map2.put(i,map2.get(i)+1);
            }
        }


        for(Map.Entry<Character, Integer> entry1 : map1.entrySet()){
            int flag = 0;
            int i = entry1.getValue();
            for(Map.Entry<Character, Integer> entry2 : map2.entrySet()){
                int j = entry2.getValue();
                if(i == j){
                    flag = 1;
                    map2.put(entry2.getKey(),0);
                    break;
                }
            }

            if(flag == 0){
                return false;
            }
        }

        return true;
    }
}