class Solution {
    public int numSpecial(int[][] mat) 
    {
        int count=0;
        for(int i = 0 ; i < mat.length ; i++)
        {
            for(int j = 0 ; j < mat[i].length ; j++)
            {
                if(mat[i][j]==0)
                {
                    continue;
                }

                boolean cond= true;
                
                for(int a = 0 ; a<mat.length ; a++)
                {
                    if(a!=i && mat[a][j]==1)
                    {
                        cond = false;
                        break;
                    }
                }

                for(int b = 0 ; b< mat[0].length ; b++)
                {
                    if(b!=j && mat[i][b]==1)
                    {
                        cond = false;
                        break;
                    }
                }
                if(cond)
                {
                    count++;
                }
            }

        }    
        return count;
    }
}