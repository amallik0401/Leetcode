class Solution {
    public int maximalSquare(char[][] matrix) {
       
       int row = matrix.length, col = matrix[0].length;
       int [][]arr = new int[row+1][col+1];
       int max = 0;

       for(int i = 1 ; i<=row ; i++)
       {
        for(int j = 1 ; j<=col ; j++)
        {
            if(matrix[i-1][j-1]=='1')
            {
                arr[i][j] = Math.min(Math.min(arr[i-1][j],arr[i][j-1]),arr[i-1][j-1])+1;
                max = Math.max(max , arr[i][j]);
            }
        }
       }
       return max*max;
    }
}