class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int last1 = nums[0];
        int last2 = nums[1];
        
        int ans[] = new int[n];
        ans[0] = last1;
        int k = 1;
        for(int i = 2; i < n; i++){
            if(last1 > last2){
                last1 = nums[i];
                ans[k++] = nums[i];
                nums[i] = -1;
            }else{
                last2 = nums[i];
            }
        }
        for(int i = 1; i < n; i++){
            if(k < n && nums[i] != -1){
                ans[k++] = nums[i];
            }
        }
        return ans;
    }
}