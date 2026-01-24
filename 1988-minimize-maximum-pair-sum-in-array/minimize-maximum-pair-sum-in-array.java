class Solution {
    public int minPairSum(int[] nums) {
       Arrays.sort(nums);
       int ans = 0;
       int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            ans = Math.max(ans , nums[i] + nums[n-i-1]);
        }

        return ans;
    }
}