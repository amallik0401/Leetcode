class Solution {
    public int maximalRectangle(char[][] matrix) {

        int n = matrix.length, m = matrix[0].length;
        int[] heights = new int[m];
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1')
                    heights[j] += 1;
                else
                    heights[j] = 0;
            }
            maxArea = Math.max(maxArea , maxi(heights));
        }
        return maxArea;
    }

    int maxi(int []heights)
    {
        int n = heights.length , maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i <= n ; i++)
        {
            int current = (i==n) ? 0 : heights[i];

            while(!stack.isEmpty() && current < heights[stack.peek()])
            {
                int height = heights[stack.pop()];
                int left = (stack.isEmpty()) ? -1 : stack.peek();
                int width = i - left - 1;
                maxArea = Math.max(maxArea , height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}