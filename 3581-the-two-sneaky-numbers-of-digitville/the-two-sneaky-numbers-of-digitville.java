class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int []ans = new int[2];
        int p = 0;

        for(int i = 0 ; i <nums.length ; i++)
        {
            if(p==2)
                break;

            if(hs.contains(nums[i]))
            {
                ans[p] = nums[i];
                p++;
            }
            else
            {
                hs.add(nums[i]);
            }
        }

        return ans;

    }
}