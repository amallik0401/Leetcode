class Solution {
    public int minimumDeleteSum(String s1, String s2) {

        int l1 = s1.length();
        int l2 = s2.length();
        
        int [][]dp = new int[l1 + 1][l2 + 1];

        for(int i = 0 ; i < l1 ; i++)
        {
            for(int j = 0 ; j < l2 ; j++)
            {
                if(s1.charAt(i) == s2.charAt(j))
                {
                    dp[i+1][j+1] = dp[i][j] + s1.charAt(i);
                }
                else
                {
                    dp[i + 1][j + 1] = Math.max(dp[i][j+1] , dp[i+1][j]);
                }
            }
        }

        int total = 0 ;

        for(char c : s1.toCharArray())
            total +=c;

        for(char c : s2.toCharArray())
            total +=c;


        return total - 2*dp[l1][l2];
    }
}