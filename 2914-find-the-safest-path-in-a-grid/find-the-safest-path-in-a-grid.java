class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {

        int n = grid.size();
        int dist[][] = new int[n][n];
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid.get(i).get(j) == 1){
                    q.offer(new int[]{i, j});
                    dist[i][j] = 0;
                }else{
                    dist[i][j] = -1;
                }
            }
        }

            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};

        while(!q.isEmpty()){
            int curr[] = q.poll();
            int r = curr[0], c = curr[1];

            for(int k = 0; k < 4; k++){
                int nr = r + dr[k];
                int nc = c + dc[k];

                if(nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] == -1){
                    dist[nr][nc] = dist[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        int low = 0; int high = 2*(n - 1);
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (canReach(dist, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public boolean canReach(int[][] dist, int limit){
        int n = dist.length;
        if (dist[0][0] < limit) return false;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];

        q.offer(new int[]{0, 0});
        vis[0][0] = true;

            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            if (r == n - 1 && c == n - 1)
                return true;

            for (int k = 0; k < 4; k++) {

                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < n &&
                    !vis[nr][nc] &&
                    dist[nr][nc] >= limit) {

                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        return false;
    }
}