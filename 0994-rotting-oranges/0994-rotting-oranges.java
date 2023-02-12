class Solution {
    public int orangesRotting(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == 2) 
                    queue.offer(new int[] {i, j});
            }
        }

        int minutes = 0;

        while (!queue.isEmpty()) {
            int queueLength = queue.size();

            for (int i = 0; i < queueLength; i++) {
                int[] rc = queue.poll();
                int[][] neighbors = {{1,0},{0,1},{-1,0},{0,-1}};

                for (int j = 0; j < 4; j++) {
                    int newR = rc[0] + neighbors[j][0];
                    int newC = rc[1] + neighbors[j][1];

                    if (Math.min(newR, newC) < 0 || newR >= ROWS || newC >= COLS
                        || grid[newR][newC] == 2 || grid[newR][newC] == 0)
                        continue;

                    queue.offer(new int[] {newR, newC});
                    grid[newR][newC] = 2;
                }
            }
            minutes++;
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == 1)
                    return -1;
            }
        }

        return minutes == 0 ? 0 : --minutes;
    }
}