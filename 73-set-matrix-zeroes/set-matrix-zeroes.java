class Solution {
    public void setZeroes(int[][] mat) {
        
        int rows = mat.length;
        int cols = mat[0].length;

        boolean firstRowZero = false;
        boolean firstcolZero = false;

        for(int r = 0 ; r < rows ; r++)
        {
            if(mat[r][0] == 0)
            {
                firstcolZero = true;
                break;
            }
        }

        for(int c = 0 ; c < cols ; c++)
        {
            if(mat[0][c] == 0)
            {
                firstRowZero = true;
                break;
            }
        }

        for(int r = 1 ; r < rows ; r++)
        {
            for(int c = 1 ; c < cols ; c++)
            {
                if(mat[r][c] == 0)
                {
                    mat[0][c] = 0;
                    mat[r][0] = 0;
                }
            }
        }

        for(int r = 1 ; r < rows ; r++)
        {
            if(mat[r][0] == 0)
            {
                Arrays.fill(mat[r] , 0);
            }
        }

        for(int c = 1 ; c < cols ; c++)
        {
            if(mat[0][c] == 0)
            {
                for(int r = 1 ; r < rows ; r++)
                {
                    mat[r][c] = 0;
                }
            }
        }

        if(firstRowZero)
        {
            Arrays.fill(mat[0] , 0);
        }

        if(firstcolZero)
        {
            for(int r = 0 ; r < rows ; r++)
            {
                mat[r][0] = 0;
            }
        }

    }
}