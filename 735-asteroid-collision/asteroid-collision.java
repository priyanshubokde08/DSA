class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n = ast.length;
        Stack<Integer> st = new Stack<>();
        for(int x : ast){
            if(x > 0){
                st.push(x);
            }else{
                while(!st.empty() && st.peek() > 0 && st.peek() < -x){
                    st.pop();
                }
                if(st.empty() || st.peek() < 0){
                    st.push(x);
                }
                else if(st.peek() == -x){
                    st.pop();
                }
            }
        }
        int ans[] = new int[st.size()];
        for(int i = st.size()-1; i >= 0; i--){
            ans[i] = st.peek();
            st.pop();
        }
        return ans;
    }
}