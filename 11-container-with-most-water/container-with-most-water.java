class Solution {
    public int maxArea(int[] h) {
        int max = 0;
        int i = 0; int j = h.length-1;
        while(i < j){
            int currArea = (Math.min(h[i],h[j])*(j-i));
            max = Math.max(max, currArea);
            if(h[i] < h[j]) i++;
            else j--;
        }
        return max;
    }
}