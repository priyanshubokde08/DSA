class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr){
        int n = arr.length;
        int freq[] = new int[n + 1];
        for(int x : arr) freq[Math.min(x, n)]++;
        int ans = 0;
        for(int i = 1; i <=n; i++){
            ans = Math.min(i, ans + freq[i]);
        }
        return ans;
    }
}