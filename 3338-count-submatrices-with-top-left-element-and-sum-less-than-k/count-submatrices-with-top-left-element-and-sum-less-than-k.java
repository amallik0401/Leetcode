class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int ans = 0 ;
        int m = grid.length;
        int n = grid[0].length;
        int [][]px = new int[m+1][n+1];
        for(int i =0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                px[i+1][j+1] = grid[i][j] + px[i+1][j] + px[i][j+1] - px[i][j];

                if(px[i+1][j+1] <= k)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}