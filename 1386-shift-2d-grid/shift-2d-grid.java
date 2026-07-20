class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int arr[] = new int[m*n];
        int p = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[p++] = grid[i][j];
            }
        }
        int ans[][] = new int[n][m];

        k %= (m * n);
        int x = arr.length - k; int y = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(k > 0 && x < arr.length){
                    ans[i][j] = arr[x];
                    k--;x++;
                }else{
                    ans[i][j] = arr[y];
                    y++;
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>();

        for (int[] row : ans) {
            List<Integer> temp = new ArrayList<>();
            for (int num : row) {
                temp.add(num);
            }
            list.add(temp);
        }
        return list;
    }
}