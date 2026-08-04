class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int max = -1; int min = 101;
        for(int x : nums){
            if(x > max) max = x;
            if(x < min) min = x;
        }
        int count = max - min + 1;
        if(count == nums.length) return li;

        int present[] = new int[count];
        Arrays.fill(present, -1);

        for(int x : nums){
            present[x - min]++;
        }
        for(int i = 0 ; i < present.length; i++){
            if(present[i] == -1) li.add(i+min);
        }
        return li;
    }
}