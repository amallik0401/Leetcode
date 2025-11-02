class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int [][]mat = new int[m][n];

        for(int []x:guards)
        {
            mat[x[0]][x[1]]=1;
        }
        for(int[] x:walls)
        {
            mat[x[0]][x[1]]=2;
        }

        for(int []guard : guards)
        {
            int row = guard[0];
            int col = guard[1];

            for(int r = row-1 ; r>=0 ; r--)
            {
                if(mat[r][col]==1 || mat[r][col]==2) 
                    break;
                if(mat[r][col]==0)
                    mat[r][col]=3;
            }
            for(int r = row+1 ; r<m ; r++)
            {
                if(mat[r][col]==1 || mat[r][col]==2) 
                    break;
                if(mat[r][col]==0)
                    mat[r][col]=3;
            }
            for(int c = col-1 ; c>=0 ; c--)
            {
                if(mat[row][c]==1 || mat[row][c]==2) 
                    break;
                if(mat[row][c]==0)
                    mat[row][c]=3;
            }
            for(int c = col+1 ; c<n ; c++)
            {
                if(mat[row][c]==1 || mat[row][c]==2) 
                    break;
                if(mat[row][c]==0)
                    mat[row][c]=3;
            }
        }
        int count=0;
        for(int []y : mat)
        {
            for(int x : y)
            {
                if(x==0)
                    count++;
            }
        }

        return count;
    }
}