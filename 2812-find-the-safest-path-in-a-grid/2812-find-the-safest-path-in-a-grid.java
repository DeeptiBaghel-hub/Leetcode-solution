class Solution {
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size(), l = 0, r = 2 * n;
        int[][] dis = new int[n][n];
        Queue<int[]> q = new LinkedList<>();

        for (int[] d : dis) Arrays.fill(d, -1);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (grid.get(i).get(j) == 1) {
                    dis[i][j] = 0;
                    q.offer(new int[]{i, j});
                }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] x : dir) {
                int ni = cur[0] + x[0], nj = cur[1] + x[1];
                if (ni >= 0 && nj >= 0 && ni < n && nj < n && dis[ni][nj] == -1) {
                    dis[ni][nj] = dis[cur[0]][cur[1]] + 1;
                    q.offer(new int[]{ni, nj});
                }
            }
        }

        while (l <= r) {
            int m = (l + r) / 2;
            if (check(dis, m)) l = m + 1;
            else r = m - 1;
        }
        return r;
    }

    boolean check(int[][] dis, int k) {
        int n = dis.length;
        if (dis[0][0] < k) return false;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];
        q.offer(new int[]{0, 0});
        vis[0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == n - 1 && cur[1] == n - 1) return true;

            for (int[] x : dir) {
                int ni = cur[0] + x[0], nj = cur[1] + x[1];
                if (ni >= 0 && nj >= 0 && ni < n && nj < n &&
                    !vis[ni][nj] && dis[ni][nj] >= k) {
                    vis[ni][nj] = true;
                    q.offer(new int[]{ni, nj});
                }
            }
        }
        return false;
    }
}