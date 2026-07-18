class Solution {
    public int largestRectangleArea(int[] h) {
        // int ans = 0; int n = h.length;
        // for(int i = 0; i < n; i++){
        //     int j = i; int  k = i;
        //     while(j < n && h[j] >= h[i]) j++;
        //     while(k >= 0 && h[k] >= h[i]) k--;
        //     int wid = j - k - 1;
        //     ans = Math.max(ans, wid*h[i]);
        // }
        // return ans;

        int n = h.length;

        Stack<Integer> st = new Stack<>();
        int nse[] = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(!st.empty() && h[st.peek()] >= h[i]) st.pop();
            nse[i] = st.empty() ? n : st.peek();
            st.push(i);
        }
        while(!st.empty()) st.pop();

        int pse[] = new int[n];
        for(int i = 0; i < n; i++){
            while(!st.empty() && h[st.peek()] > h[i]) st.pop();
            pse[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            int wid = nse[i] - pse[i] - 1;
            ans = Math.max(ans, h[i]*wid);
        }
        return ans;
    }
}