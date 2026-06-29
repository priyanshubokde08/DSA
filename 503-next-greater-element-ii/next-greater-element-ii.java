class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();

        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            ans[i] = Integer.MIN_VALUE;

            // right
            for(int j = i + 1; j < n; j++){
                if(nums[j] > nums[i]){
                    ans[i] = nums[j];
                    break;
                }
            }
            // Circular
            if(ans[i] == Integer.MIN_VALUE){
                for(int j = 0; j < i; j++){
                    if(nums[j] > nums[i]){
                        ans[i] = nums[j];
                        break;
                    }
                }
                if(ans[i] == Integer.MIN_VALUE) ans[i] = -1;
            }
        }
        return ans;
    }
}