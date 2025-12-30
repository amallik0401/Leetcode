class Solution {
    public int numMagicSquaresInside(int[][] grid) {

        int r = grid.length;
        int c = grid[0].length;
        int count = 0; 

        for(int i = 0 ; i < r-2 ; i++)
        {
            for(int j = 0 ; j < c-2 ; j++)
            {
                if(isTrue(grid , i , j))
                {
                    count++;
                }
            }
        }
        return count;
        
    }
    private boolean isTrue(int [][]grid ,int row ,int col)
    {
        boolean[]seen = new boolean[10];
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                int num = grid[row + i][col + j];
                if(num<1 || num > 9)
                    return false;
                if(seen[num])
                    return false;
                
                seen[num] = true;
            }
        }

        int diagonal1 = grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2];
        int diagonal2 = grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2];

        if (diagonal1 != diagonal2) return false;

        int row1 = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];
        int row2 = grid[row + 1][col] + grid[row + 1][col + 1] + grid[row + 1][col + 2];
        int row3 = grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2];

        if (!(row1 == diagonal1 && row2 == diagonal1 && row3 == diagonal1)) 
            return false;
        

        int col1 = grid[row][col] + grid[row + 1][col] + grid[row + 2][col];
        int col2 = grid[row][col + 1] + grid[row + 1][col + 1] + grid[row + 2][col + 1];
        int col3 = grid[row][col + 2] + grid[row + 1][col + 2] + grid[row + 2][col + 2];

        if (!(col1 == diagonal1 && col2 == diagonal1 && col3 == diagonal2)) 
            return false;
        

        return true;
    }
}