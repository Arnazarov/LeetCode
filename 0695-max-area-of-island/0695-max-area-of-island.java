class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0)
            return 0;

        int area = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                area = Math.max(area, dfs(grid, r, c));
            }
        }
        return area;
    }
    private int dfs(int[][] grid, int r, int c) {
        if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == 1) {
            grid[r][c] = 0;
            return (1 + dfs(grid, r + 1, c) + dfs(grid, r - 1, c) +
                    dfs(grid, r, c + 1) + dfs(grid, r, c - 1));
        }
        return 0;
    }
}