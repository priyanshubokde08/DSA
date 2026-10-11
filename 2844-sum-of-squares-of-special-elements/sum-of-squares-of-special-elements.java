class Solution {
    public int sumOfSquares(int[] nums) {
        long sum = 0;
        int n = nums.length;
        
        for(int i = 1; i <= n; i++){
            int x = nums[i-1];
            if(n%i == 0) sum += Math.pow(x,2);
        }
        return (int)sum;
    }
}