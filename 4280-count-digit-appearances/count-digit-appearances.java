class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c = 0;
        for(int x : nums){
            while(x > 0){
                int dig = x % 10;
                x/=10;
                if(dig == digit) c++;
            }
        }
        return c;
    }
}