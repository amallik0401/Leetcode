class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int total = 0;

        for(int i : stones)
        {
            total += i;
        }

        boolean [][]dp = new boolean[n+1][total/2+1];

        for(int i = 0 ; i <= n ; i++)
        {
            dp[i][0] = true;
        }

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= total/2 ; j++)
            {
                if(j<stones[i-1])
                {
                    dp[i][j] = dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j- stones[i-1]];
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i <= total/2 ; i++)
        {
            if(dp[n][i])
                min = Math.min(min , Math.abs((total - i) - i));
        }

        return min;
    }
}