class Solution {
    public int findGCD(int[] arr) {
        int max = arr[0], min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        while(max != 0){
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }
}