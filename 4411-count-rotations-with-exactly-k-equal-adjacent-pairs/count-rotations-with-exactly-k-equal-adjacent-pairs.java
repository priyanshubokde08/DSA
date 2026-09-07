class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int pre[] = new int[n];
        s = s + s;
        int score = 0;
        for(int i = 0; i < n; i++){
            int c = 0;
            for(int j = i; j <= i+n-2; j++){
                if(s.charAt(j) == s.charAt(j+1)) c++;
            }
            if(c == k) score++;
        }
        return score;
    }
}