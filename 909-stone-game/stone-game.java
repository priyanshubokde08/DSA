class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int dp[] = piles.clone();
        if(n % 2 == 0) return true;
        for(int i = n-2; i >= 0; i--){
            for(int j=i+1; j < n; j++){
                dp[j] = Math.max(dp[i] - dp[j], dp[j] - dp[j-1]);
            }
        }
        return dp[n-1] > 0;
    }
}