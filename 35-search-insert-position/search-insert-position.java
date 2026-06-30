class Solution {
    public int searchInsert(int[] nums, int target) {
    int n = nums.length;
    if(target > nums[n-1]) return n;
    else if(target <= nums[0]) return 0;
    for(int i = 0; i < n - 1; i++){
        if(nums[i] == target) return i;
        else if(target >= nums[i] && target <= nums[i+1]) return i + 1;
    }
    return -1;
    }
}