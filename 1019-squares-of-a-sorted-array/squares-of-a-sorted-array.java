class Solution {
    public int[] sortedSquares(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int l = 0 , r = nums.length-1;

        while(l<=r)
        {
            int lv = Math.abs(nums[l]);
            int rv = Math.abs(nums[r]);

            if(lv > rv)
            {
                stack.push(nums[l]*nums[l]);
                l++;
            }
            else
            {
                stack.push(nums[r]*nums[r]);
                r--;
            }
        }

        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = stack.pop();
        }
        
        return nums;
    }
}