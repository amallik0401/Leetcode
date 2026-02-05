class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int []ans = new int[n];

        for(int i = 0 ; i < n ; i++)
        {
            int ind = i + ((nums[i]) % n);

            if(ind < 0)
                ind = n + ind;

            if(ind >= n)
                ind =  ind - n;

            ans[i] = nums[ind];
        }

        return ans;
    }
}