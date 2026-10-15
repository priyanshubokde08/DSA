class Solution {
    public int sumCounts(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.size();
        long sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                set.add(nums.get(j));
                sum += Math.pow(set.size(),2);
            }
            set.clear();
        }
        return (int)sum;
    }
}