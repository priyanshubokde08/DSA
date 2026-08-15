class Solution {
    public int longestSubsequence(int[] nums) {
        boolean ok = false;
        for(int x : nums){
            if(x != 0) ok = true;
        }
        if(!ok) return 0;
        
        int n = nums.length;
        int xor = nums[0];
        for(int i = 1; i < n; i++){
            xor ^= nums[i];
        }
        if(xor != 0) return n;
        else return n-1;
    }
}