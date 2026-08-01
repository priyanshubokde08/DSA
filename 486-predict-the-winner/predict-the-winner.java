class Solution {
    public boolean predictTheWinner(int[] arr) {
        int n = arr.length;
        if(n % 2 == 0) return true;
        int dp[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            dp[i][i] = arr[i];
        }
        for(int len = 2; len <= n; len++){
            for(int i = 0; i <= n - len; i++){
                int j = i + len - 1;

                int pickLeft = arr[i] - dp[i+1][j];
                int pickRight = arr[j] - dp[i][j-1];

                dp[i][j] = Math.max(pickLeft, pickRight);
            }
        }
        return dp[0][n-1] >= 0;
    }
}