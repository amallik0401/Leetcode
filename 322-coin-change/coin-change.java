class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount < 0) {
            return -1;
        }
        
        int []dp = new int[amount+1];

        Arrays.fill(dp , amount+1);

        dp[0] = 0;

        for(int i = 1 ; i <= amount ; i++)
        {
            for(int c : coins)
            {
                if(i-c >= 0)
                {
                    dp[i] = Math.min(dp[i] , 1 + dp[i-c]); 
                }
            }
        }
        
        if(dp[amount] != amount+1)
            return dp[amount];
        else
            return -1;

    }
}