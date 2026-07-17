class Solution {
    static long SumOfmaxOfSubArray(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!st.empty() && arr[st.peek()] < arr[i]) st.pop();
            nge[i] = st.empty() ? n : st.peek();
            st.push(i);
        }
        while(!st.empty()) st.pop();
        int pge[] = new int[n];
        for(int i = 0; i < n; i++){
            while(!st.empty() && arr[st.peek()] <= arr[i]) st.pop();
            pge[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }
        long total = 0;
        for(int i = 0; i < n; i++){
            int left = i - pge[i];
            int right = nge[i] - i;
            total = total + ((long)left*right*arr[i]);
        }
        return total;
    }
    static long SumOfMinOfSubArray(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int nse[] = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!st.empty() && arr[st.peek()] >= arr[i]) st.pop();
            nse[i] = st.empty() ? n : st.peek();
            st.push(i);
        }
        while(!st.empty()) st.pop();
        int pse[] = new int[n];
        for(int i = 0; i < n; i++){
            while(!st.empty() && arr[st.peek()] > arr[i]) st.pop();
            pse[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }
        long total = 0;
        for(int i = 0; i < n; i++){
            int left = i - pse[i];
            int right = nse[i] - i;
            total = total + ((long)left*right*arr[i]);
        }
        return total;
    }
    public long subArrayRanges(int[] nums) {
        return SumOfmaxOfSubArray(nums) - SumOfMinOfSubArray(nums);
    }
}