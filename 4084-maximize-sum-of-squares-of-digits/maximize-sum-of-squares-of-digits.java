class Solution {
    public String maxSumOfSquares(int n, int sum) {
        StringBuilder sb = new StringBuilder();
        while(sb.length() < n && sum >= 9){
            sb.append(9);
            sum -= 9;
        } 
        if((sb.length() == n) && sum != 0) return "";
        for(int j = sb.length(); j < n; j++){
            if(sum != 0) sb.append(sum);
            else sb.append(0);
            sum = 0;
        }
        return sb.toString();
    }
}