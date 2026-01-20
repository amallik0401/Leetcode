class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        
        int ans[] = new int[nums.size()];

        for(int i = 0 ; i < nums.size() ; i++)
        {
            ans[i] = -1;
            for(int j = 0 ; j <= nums.get(i) ; j++)
            {
                if((j | j+1) == nums.get(i))
                {
                    ans[i] = j;
                    break;
                }
            }
        }

        return ans;
    }
}