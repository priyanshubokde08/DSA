class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int curr = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]+1){
                curr += nums[i];
            }else{
                break;
            }
        }
        Arrays.sort(nums);
        int a = curr;
        Set<Integer> set = new HashSet();
        for(int x : nums) set.add(x);
        while(true){
            if(!set.contains(a)) return a;
            a++;
        }
    }
}