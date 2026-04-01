class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int p = 1;
        int isZero = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]==0)
            {
                isZero++;
            }
            else
            {
                p *= nums[i];
            }
        }

        int [] ans = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(isZero > 1)
            {
                ans[i] = 0;
            }
            else if(isZero == 1)
            {
                if(nums[i]==0)
                    ans[i] = p;
                else
                    ans[i] = 0;
            }
            else
            {
                ans[i] = p / nums[i];
            }
        }

        return ans;

    }
}