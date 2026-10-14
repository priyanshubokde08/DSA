class Solution {
    public String maxSumOfSquares(int n, int sum) {
        int arr[] = new int[n];
        int i = 0;
        while(i < n && sum >= 9){
            arr[i] = 9;
            sum -= 9;
            i++;
        } 
        if((i == (n)) && sum != 0) return "";
        for(int j = i; j < n; j++){
            if(sum != 0) arr[j] = sum;
            else arr[j] = 0;
            sum = 0;
        }
        StringBuilder sb = new StringBuilder();
        for(int x : arr) sb.append(x);
        return sb.toString();
    }
}