class Solution {
    public int largestAltitude(int[] gain) {
        int len = 0;int ans = len;
        for(int i = 0; i < gain.length; i++){
            len = len + gain[i];
            ans = Math.max(ans, len);
        }
        return ans;
    }
}