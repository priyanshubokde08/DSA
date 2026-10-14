class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        int i = 0;
        while(i < n){
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int key = entry.getKey();
                int val = entry.getValue();
                if(val > 0){
                    nums[i] = key;
                    map.put(key, val-1);
                    i++;
                }
            }
        }
        return nums;
    }
}