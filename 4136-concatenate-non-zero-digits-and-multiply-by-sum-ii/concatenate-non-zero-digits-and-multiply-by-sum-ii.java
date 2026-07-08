class Solution {

    static final int MOD = 1000000007;

    public int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();
        int[] pow = new int[n + 1];
        int[] prefSum = new int[n + 1];
        int[] prefNum = new int[n + 1];
        int[] prefCnt = new int[n + 1];

        pow[0] = 1;

        for (int i = 0; i < n; i++) {
            pow[i + 1] = (int) (pow[i] * 10L % MOD);

            int digit = s.charAt(i) - '0';
            prefSum[i + 1] = prefSum[i] + digit;
            prefNum[i + 1] = prefNum[i];
            prefCnt[i + 1] = prefCnt[i];

            if (digit != 0) {
                prefNum[i + 1] = (int) ((prefNum[i] * 10L + digit) % MOD);
                prefCnt[i + 1]++;
            }
        }

        int[] ans = new int[queries.length];
        int k = 0;
        for (int[] q : queries) {

            int l = q[0];
            int r = q[1] + 1;

            long x = (prefNum[r] - (long) prefNum[l] * pow[prefCnt[r] - prefCnt[l]] % MOD + MOD) % MOD;

            ans[k] = (int) (x * (prefSum[r] - prefSum[l]) % MOD);
            k++;
        }

        return ans;
    }
}