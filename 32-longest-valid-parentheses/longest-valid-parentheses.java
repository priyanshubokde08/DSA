class Solution {
    public int longestValidParentheses(String s) {
        int op = 0; int cl = 0;
        long max = 0;
        //left to right
        for(char x : s.toCharArray()){
            if(x == '('){
                op++;
            }else{
                cl++;
            }
            if(op == cl){
                max = Math.max(max, 2*cl);
            }else if(cl > op){
                cl = 0; op = 0;
            }
        }
        //right to left
        op = 0; cl = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == '(') op++;
            else cl++;

            if(op == cl){
                max = Math.max(max, 2*op);
            }else if(op>cl){
                cl = 0; op = 0;
            }
        }
        return (int)max;
    }
}