class Solution {
    boolean [][] dp;
    public boolean canPartition(int[] nums) {
        
        int sum = 0 ;
        for(int a : nums)
        {
            sum += a;
        }

        if(sum%2 != 0)
        {
            return false;
        }
        else
        {
            int k = sum/2;
            int n = nums.length;

            dp = new boolean [n+1][k+1];
            for(int i = 0 ; i <= n ; i++)
            {
                dp[i][0] = true;
            }

            return helper(nums, k , dp);

        }
    }

    boolean helper(int []arr , int k , boolean[][]dp)
    {
        for(int i = 1 ; i <= arr.length ; i++)
        {
            for(int j = 1 ; j <= k ; j++)
            {
                if(j < arr[i-1])
                {
                    dp[i][j] = dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[arr.length][k];
    }

}