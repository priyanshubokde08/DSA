class Solution {
    public int removeCoveredIntervals(int[][] inter) {
        int n = inter.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j != i){
                    if(inter[j][1] >= inter[i][1] && inter[j][0] <= inter[i][0]){
                        count++;
                        break;
                    }
                }
            }
        }
        return (n - count == 0) ? 2 : n - count;
    }
}