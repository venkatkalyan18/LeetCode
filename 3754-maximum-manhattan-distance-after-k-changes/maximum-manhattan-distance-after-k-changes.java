class Solution {
    public int maxDistance(String s, int k) {
        int ans = 0;

        for (char hor : new char[]{'E', 'W'}) {
            for (char ver : new char[]{'N', 'S'}) {
                int remainingK = k;
                int netX = 0, netY = 0;

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if(ch == 'N' || ch == 'S'){
                        if(ch != ver && remainingK > 0){
                            ch = (ch == 'N' ? 'S' : 'N');
                            remainingK--;
                        }
                    } else if (ch == 'E' || ch == 'W') {
                        if(ch != hor && remainingK > 0){
                            ch = (ch == 'E' ? 'W' : 'E');
                            remainingK--;
                        }
                    }

                    if (ch == 'E') netX++;
                    if (ch == 'W') netX--;
                    if (ch == 'N') netY++;
                    if (ch == 'S') netY--;

                    ans = Math.max(ans, Math.abs(netX) + Math.abs(netY));
                }
            }
        }

        return ans;
    }
}
