class Solution
{
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
    int n = nums.size();

    int[][] dp = new int[n+1][target + 1];
    for (int[] row : dp) {
        Arrays.fill(row, -1);
    }

    for (int i = 0; i<=n; i++) {
        dp[i][0] = 0;
    }

    for (int i = 1; i<n+1; i++) {
        for (int j = 1; j < target+ 1; j++) {
            // case 1: if we don't take nums[i-1]
            dp[i][j] = dp[i-1][j];
            // case 2: if we take take nums[i-1]
            if (j >= nums.get(i-1) && dp[i-1][j - nums.get(i-1)] != -1) {
                dp[i][j] = Math.max(dp[i][j], 1 + dp[i-1][j - nums.get(i-1)]);
            }
        }
    }
    return dp[n][target];
}
}