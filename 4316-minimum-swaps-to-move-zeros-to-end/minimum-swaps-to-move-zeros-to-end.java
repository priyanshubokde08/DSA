class Solution {
    public int minimumSwaps(int[] nums) {
        int k = 0;
        for(int x : nums){
            if(x == 0) k++;
        }
        int count = 0;
        for(int i = nums.length -1; i >= 0; i--){
            if(k == 0) break;
            if(nums[i] != 0){
                count++;
            }
            k--;
        }
        return count;
    }
}