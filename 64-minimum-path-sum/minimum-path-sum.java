class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][]dp = new int[m][n];
        dp[0][0] = grid[0][0];

        //first row
        for(int i = 1 ; i < m ; i++)
        {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        //first col
        for(int i = 1 ; i < n ; i++)
        {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        
        for(int i = 1 ; i < m ; i++)
        {
            for(int j = 1 ; j < n ; j++)
            {
                int top = grid[i][j] +  dp[i-1][j];
                int left = grid[i][j] +  dp[i][j-1];

                dp[i][j] = Math.min(top, left);
            }
        }
        return dp[m-1][n-1];
    }
}