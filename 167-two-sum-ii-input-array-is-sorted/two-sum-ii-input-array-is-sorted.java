class Solution {
    public int[] twoSum(int[] nums, int target) {

        int l = 0 , r = nums.length-1;

        while(true)
        {
            int left = nums[l];
            int right = nums[r];

            int ans = left + right;

            if(ans < target)
                l++;
            else if(ans > target)
                r--;
            else
                return new int[]{l+1 ,r+1};
        }

    }
}