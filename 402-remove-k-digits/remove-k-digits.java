class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k == n) return "0";

        Stack<Character> st = new Stack<>();
        char arr[] = num.toCharArray();
        for(int i = 0; i < n; i++){
            while(!st.empty() && k > 0 && st.peek() > arr[i]){
                st.pop();k--;
            }
            st.push(arr[i]);
        }
        while(k > 0) {st.pop(); k--;}

        if(st.empty()) return "0";

        StringBuilder sb = new StringBuilder();
        boolean ok = false;
        for(char ch : st){
            if(ch != '0') ok = true;
            if(ok) sb.append(ch);
        }
        if(sb.length() == 0) return "0";
        return sb.toString();
    }
}