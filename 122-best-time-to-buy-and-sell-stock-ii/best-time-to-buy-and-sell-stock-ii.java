class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int ans = 0;

        for(int i = 0 ; i<n-1 ;i++)
        {
            if(prices[i+1]>prices[i])
            {
                int j = i+1;
                while(j<n-1)
                {
                    if( prices[j+1]<prices[j])
                        break;
                    j++;
                }

                ans += prices[j] - prices[i];

                i=j;
            }
        }
        return ans;
    }
}