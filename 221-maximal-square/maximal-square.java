class Solution {
    public int maximalSquare(char[][] matrix) {
       
       if(matrix.length==0 || matrix[0].length==0)
       {
        return 0;
       }

       int row = matrix.length;
       int col = matrix[0].length;
       int [][]arr = new int[row][col];
       int max = 0;

       for(int i = 0 ; i< row ; i++)
       {
        for(int j = 0 ; j<col ; j++)
        {
            if(matrix[i][j]=='1')
            {
                if(i==0 || j==0)
                {
                    arr[i][j] =1;
                }
                else
                {
                    arr[i][j] = Math.min(Math.min(arr[i-1][j],arr[i][j-1]),arr[i-1][j-1])+1;
                }
                max = Math.max(max , arr[i][j]);
            }
        }
       }
       return max*max;
    }
}