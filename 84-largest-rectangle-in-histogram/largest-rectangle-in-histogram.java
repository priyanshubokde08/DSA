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
        int max = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <= n; i++){
            int currhigh = (i == n) ? 0 : h[i];
            while(!st.empty() && currhigh < h[st.peek()]){
                int high = h[st.pop()];
                int wid = st.empty() ? i : i - st.peek() - 1;
                max = Math.max(max, wid*high);
            }
                st.push(i);
        }
        return max;
    }
}