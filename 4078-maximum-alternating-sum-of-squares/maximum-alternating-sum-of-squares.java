class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
       // for(int x : nums) x = Math.abs(x + 1 - 1); cant use this, cuz we have to apfate at place
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long sum = 0;
        for(int i = 0; i < n/2; i++){
            sum += ((Math.pow(nums[n-i-1],2)) - (Math.pow(nums[i],2)));
        }
        if(n % 2 == 1) sum += Math.pow(nums[n/2],2);
        return sum;
    }
}