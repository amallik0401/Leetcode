class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;

        Stack<Integer> stack = new Stack<>();
        int []ans = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            while(!stack.isEmpty() && temp[i]>temp[stack.peek()])
            {
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }

        return ans;
    }
}