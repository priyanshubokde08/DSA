class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '('){
                st.push(x);
            }else{
                if(!st.empty() && st.peek() == '('){
                    st.pop();
                }else{
                    st.push(x);
                }
            }
        }
        return st.size();
    }
}