class Solution {
    public int[] distinctDifferenceArray(int[] nums) {

        int n = nums.length;
        int []ans = new int[n];

        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i<n ; i++)
        {
            set.add(nums[i]);
            ans[i] = set.size();
        }

        set.clear();

        for(int i = n-1 ; i>=0 ; i--)
        {
            ans[i] = ans[i] - set.size();
            set.add(nums[i]);
        }

        return ans;
    }
}