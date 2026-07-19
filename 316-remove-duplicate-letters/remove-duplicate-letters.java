class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        //last index
        int arr[] = new int[26];
        for(int i = 0; i < n; i++) arr[s.charAt(i) - 'a'] = i;

        //visited to remove dupplicate 
        boolean vis[] = new boolean[26];
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(vis[ch-'a']) continue;// visited then continue

            // to maintain lexicographical structure
            while(!st.empty() && st.peek() >= ch && arr[st.peek() - 'a'] > i){
                int x = st.pop() - 'a';
                vis[x] = false;
            }

            st.push(ch);
            vis[ch-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st) sb.append(ch);
        return sb.toString();
    }
}