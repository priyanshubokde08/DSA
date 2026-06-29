class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();

        int n = nums.length;
        int ans[] = new int[n];

        for(int i =2 * n - 1; i >=0; i--){
            int idx = i % n;
            while(!st.empty() && nums[idx] >= st.peek()){
                st.pop();
            }
            if(i < n){
                if(st.empty()){
                    ans[idx] = -1;
                }else{
                    ans[idx] = st.peek();
                }
            }
            st.push(nums[idx]);
        }
        return ans;
    }
}