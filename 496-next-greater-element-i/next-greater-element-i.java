class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        Arrays.fill(ans, -1);
        for(int i = 0; i < n; i++){
            int j = 0;
            while(j < m && nums2[j] != nums1[i]) j++;
            while(j < m){
                if(nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}