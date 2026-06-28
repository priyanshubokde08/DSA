class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]) count++;
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }
        return count;
    }
}