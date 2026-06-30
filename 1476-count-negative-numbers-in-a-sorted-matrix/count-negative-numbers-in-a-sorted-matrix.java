class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length; int m = grid[0].length; int i = 0; int j = n - 1; int count = 0;
        while(j >= 0 && i < m ){
            if(grid[j][i] < 0 ){
                count += m - i; j--;
            }else{
                i++;
            }
        }
        return count;
    }
}