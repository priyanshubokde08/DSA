class Solution {
    public int maxProduct(int[] nums) {
        long max1 = -1; long max2 = -1;
        for(long x : nums){
            if(x > max1){
                max2 = max1;
                max1 = x;
            }else if(x > max2){
                max2 = x;
            }
        }
        return (int)((max1-1)*(max2-1));
    }
}