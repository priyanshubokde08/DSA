class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = k ; i < 1000; i += k){
            boolean present = false;
            for(int x : nums){
                if(x == i) present = true;
            }
            if(!present) return i;
        }
        return nums[nums.length-1];
        }
}