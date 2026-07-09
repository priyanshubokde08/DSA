class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums) if(x > 0) set.add(x);
        for(int i = 1; i < Integer.MAX_VALUE; i++){
            if(!set.contains(i)) return i;
        }
        return Integer.MAX_VALUE;
    }
}