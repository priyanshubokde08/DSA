class Solution {
    public int longestOnes(int[] nums, int k) {
        //input
        int left = 0;
        int zeroCount = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            //Expand
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++; // Shrink
            }
            // Answer update
            ans = Math.max(ans, right - left + 1); 
        }
        return ans;
    }
}