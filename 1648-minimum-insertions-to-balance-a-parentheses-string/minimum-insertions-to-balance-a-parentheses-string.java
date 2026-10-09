class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int i = 0;
            int b = 0;
            int c = 0;
        while(i < n){
            char x = s.charAt(i);
            if(x == '('){
             b++;
            }else{
                if((i+1) < n && s.charAt(i+1) == ')'){
                    b--;
                    i++;
                }else{
                    c++;
                    b--;
                }
            }
            if(b < 0){
                c++;
                b = 0;
            }
            i++;
        }
        if(b > 0) c += b*2;
        return c;
    }
}