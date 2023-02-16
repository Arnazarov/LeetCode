class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] memo = {1, 2};
        int i = 2;
        while (i < n) {
            int temp = memo[1];
            memo[1] = memo[0] + memo[1];
            memo[0] = temp;
            i++;
        }
        return memo[1];
    }
}