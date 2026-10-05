class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for(char x : s.toCharArray()){
            if(x == '('){
                st.push(0);
            }
            else{
                int in = st.pop();
                int score = 0;
                if(in == 0) {
                    score = 1;
                }else{
                    score = 2*in;
                }
               st.push(st.pop()+score);
            }
        }
        return st.pop();
    }
}