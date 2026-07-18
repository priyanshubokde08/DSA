class Solution {
    public static int histogram(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int max = 0;
        for(int i = 0; i <= n; i++){
            int currhigh = (i == n) ? 0 : arr[i];
            while(!st.empty() && currhigh < arr[st.peek()]){
                int high = arr[st.pop()];
                int wid = st.empty() ? i : i - st.peek() - 1;
                max = Math.max(max, high*wid);
            }
            st.push(i);
        }
        return max;
    }
    public int maximalRectangle(char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // it is just a combination of histogram
        int h[][] = new int[n][m];

        for(int i = 0; i < m; i++){
            int val = 0;
            for(int j = 0; j < n; j++){
                if(mat[j][i] == '1') val++;
                else val = 0;
                h[j][i] = val;
            }
        }
        int ans = 0;
        for(int arr[] : h){
            ans = Math.max(ans, histogram(arr));
        }
        return ans;
    }
}