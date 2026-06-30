class Solution {
    public boolean doesAliceWin(String s) {
        int k = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') k++;
        }
        return k != 0;
    }
}