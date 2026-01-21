class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans [] = new int[nums.size()];
        for(int i = 0 ; i < ans.length ; i++)
        {
            int x = nums.get(i);
            int res = -1;
            int d = 1;

            while((x&d) != 0)
            {
                res = x - d;
                d<<=1;
            }
            ans[i] = res;
        }
        return ans;
    }
}