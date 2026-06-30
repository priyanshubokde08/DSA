class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length; int start = 0; int last = n - 1;
        while(start < n - 1 && nums[start] == nums[start + 1]) start++;
        while(last > 0 && nums[last] == nums[last - 1]) last--;
        int ans = last - start - 1;
        if(ans < 0) return 0;
        return last - start - 1;
    }
}