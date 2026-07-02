class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();

        Queue<int[]> queue = new LinkedList<>();
        int[][] best = new int[m][n];

        for (int[] row : best)
            Arrays.fill(row, -1);

        int startHealth = health - grid.get(0).get(0);

        if (startHealth <= 0)
            return false;

        queue.offer(new int[]{0, 0, startHealth});
        best[0][0] = startHealth;

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            int x = curr[0];
            int y = curr[1];
            int h = curr[2];

            if (x == m - 1 && y == n - 1)
                return true;

            for (int[] d : dir) {
                int nx = x + d[0];
                int ny = y + d[1];

                if (nx < 0 || ny < 0 || nx >= m || ny >= n)
                    continue;

                int newHealth = h - grid.get(nx).get(ny);

                if (newHealth > 0 && newHealth > best[nx][ny]) {
                    best[nx][ny] = newHealth;
                    queue.offer(new int[]{nx, ny, newHealth});
                }
            }
        }

        return false;
    }
}