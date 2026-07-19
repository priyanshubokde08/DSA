class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        
        // Last index
        int arr[] = new int[26];
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            arr[ch -'a'] = i;
        }
        boolean[] vis = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if (vis[ch - 'a']) continue;
            while(!st.empty() && st.peek() >= ch && arr[st.peek() - 'a'] > i){
                char x = st.pop();
                vis[x - 'a'] = false;
            }
            st.push(ch);
            vis[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for( char ch : st ){
            sb.append(ch);
        }
    
        return sb.toString();
    }
}