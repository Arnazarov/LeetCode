class Solution {
    public int uniquePaths(int m, int n) {
       int memo[][] = new int[m][n];
        return memoization(0, 0 , m-1 , n-1, memo);
    }
    
    private int memoization(int r, int c, int ROW, int COL, int[][] memo) {
        if (r > ROW || c > COL)
            return 0;
        if (r == ROW || c == COL) {
            memo[r][c] = 1;
            return 1;
        }
        if (memo[r][c] != 0)
            return memo[r][c];

        memo[r][c] = memoization(r + 1, c, ROW, COL, memo) +
                memoization(r, c + 1, ROW, COL, memo);

        return memo[r][c];

    }
}