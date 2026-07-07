class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int m = mat.length; int n = mat[0].length;
        int low = mat[0][0]; int high = mat[m - 1][n -1];

        while(low < high){
            int count = 0;
            int mid = low + (high - low) / 2;
                for(int i = 0; i < m; i++){
                    int j = n - 1;
                    while(j >= 0 && mat[i][j] > mid) j--;
                    count += (j + 1);
                }
            if(count < k) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}