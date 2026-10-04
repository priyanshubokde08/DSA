class Solution {
    public boolean checkValidString(String s) {
        int ok = 0;
        for(char x : s.toCharArray()){
            if(x == '(' || x == '*') ok++;
            else ok--;
            if(ok < 0) return false;
        }
        ok = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char x = s.charAt(i);
            if(x == ')' || x == '*') ok++;
            else ok--;
            if(ok < 0) return false;
        }
        return true;
    }
}