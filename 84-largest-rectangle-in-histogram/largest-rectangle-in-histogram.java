class Solution {
    public int largestRectangleArea(int[] heights) {
        
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
                maxArea = Math.max(maxArea , height *width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}