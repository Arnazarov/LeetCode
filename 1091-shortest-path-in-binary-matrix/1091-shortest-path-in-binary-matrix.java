class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        Deque<int[]> queue = new ArrayDeque<>();
        int[][] visited = new int[ROWS][COLS];
        queue.offer(new int[2]);
        visited[0][0] = 1;

        int[] RC = new int[2];
        int length = 1;

        while (!queue.isEmpty()) {
            int queueLength = queue.size();
            int[][] neighbors = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, -1}, {1, 1}, {-1, -1}, {-1, 1}};
            for (int i = 0; i < queueLength; i++) {
                int[] rc = queue.poll();
                RC = rc;

                if (grid[rc[0]][rc[1]] == 1)
                    return -1;

                if (rc[0] == ROWS - 1 && rc[1] == COLS - 1)
                    return length;

                for (int j = 0; j < neighbors.length; j++) {
                    int newR = rc[0] + neighbors[j][0];
                    int newC = rc[1] + neighbors[j][1];

                    if (Math.min(newR, newC) < 0 || newR >= ROWS || newC >= COLS
                            || visited[newR][newC] == 1 || grid[newR][newC] == 1)
                        continue;

                    visited[newR][newC] = 1;
                    queue.offer(new int[]{newR, newC});
                }
            }
            length++;
        }
        return (RC[0] == ROWS - 1 && RC[1] == COLS - 1) ? length : -1;
    }
}