class Solution {
    public int[][] generateMatrix(int n) {
        int [][]mat = new int[n][n];
        int m = 1;
        int top = 0;
        int bottom = n-1;
        int left = 0; 
        int right = n-1;

        while(top<=bottom && left<=right)
        {
            for(int i = left ; i<=right ; i++)
            {
                mat[top][i] = m++;
            }
            top++;

            for(int i =top ; i<=bottom ; i++)
            {
                mat[i][right] = m++;
            }
            right--;


           for(int i = right ; i >= left ;i--)
                {
                    mat[bottom][i] = m++;
                }
                bottom--;
            


                for(int i = bottom ; i>=top ; i--)
                {
                    mat[i][left] = m++;
                }   
                left++;
            
        }
        return mat;
    }
}