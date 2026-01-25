class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i+k<=nums.length ; i++)
        {
            ans = Math.min(ans , nums[i+k-1]- nums[i]);
        }
        if(ans==Integer.MAX_VALUE)
            return 0;

        return ans;
    }
}