class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0; int n= nums.length;
        for(int i = 0; i < n; i++){
            int k = 0;
            for(int j = i; j < n; j++){
                if(nums[j] == target) k++;
                if(2*k > (j-i+1)) count++;
            }
        }
        return count;
    }
}