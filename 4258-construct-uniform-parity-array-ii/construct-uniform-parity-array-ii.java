class Solution {
    public boolean uniformArray(int[] arr) {
        int n = arr.length;
        if(n == 1) return true;
        
        Arrays.sort(arr);
        if(arr[0] % 2 == 0){
            for(int i = 1; i < n; i++){
                if(arr[i] % 2 == 1) return false;
            }
        }
        return true;
    }
}