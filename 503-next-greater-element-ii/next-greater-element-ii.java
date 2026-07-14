class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length; int arr[] = new int[n];
        Arrays.fill(arr, -1);
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < i + n; j++){
                int idx = j % n;
                if(nums[idx] > nums[i]){
                    arr[i] = nums[idx];
                    break;
                }
            }
        }
        return arr;
    }
}