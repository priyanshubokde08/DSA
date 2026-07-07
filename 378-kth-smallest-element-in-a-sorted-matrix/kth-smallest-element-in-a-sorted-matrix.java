class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int m = mat.length; int n = mat[0].length;

        int arr[] = new int[m*n];

        int r = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[r] = mat[i][j];
                r++;
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}