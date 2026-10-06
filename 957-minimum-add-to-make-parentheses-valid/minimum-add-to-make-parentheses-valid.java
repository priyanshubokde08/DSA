class Solution {
    public int minAddToMakeValid(String s) {
        int op = 0; int cl = 0;
        for(char x : s.toCharArray()){
            if(x == '('){
                op++;
            }else{
                if(op > 0){
                    op--;
                }else{
                    cl++;
                }
            }
        }
        return op+cl;
    }
}