class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int n = nums.length;
        int total = 0;

        for(int i : nums)
        {
            total += i;
        }
        if(Math.abs(target) > total || (total + target)%2 != 0)
            return 0;

        int s1 = (total+target)/2;

        int[][]dp = new int[n+1][s1+1];

        for(int i = 0 ; i <= n ;i++)
        {
            dp[i][0] = 1;
        }

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 0 ; j <= s1 ; j++)
            {
                if(j<nums[i-1])
                {
                    dp[i][j] = dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }
            }
        }

        return dp[n][s1];

    }
}