class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int [][] arr = new int[n][n];

        for(int i = 0 ; i < n ;i++)
        {
            for(int j = 0 ; j < n ;j++)
            {
                arr[i][j] = matrix[j][i];
            }
        }

        for(int i = 0 ; i < n ;i++)
        {
            int start = 0;
            int end = n-1;

            while(start<end)
            {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }

        for(int i = 0 ; i < n ;i++)
        {
            for(int j = 0 ; j < n ;j++)
            {
                matrix[i][j] = arr[i][j];
            }
        }

    }
}