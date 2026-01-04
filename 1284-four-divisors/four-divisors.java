class Solution {
    public int sumFourDivisors(int[] nums) {

        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int sum = 0;
            int count = 0;
            for(int j = 2 ; j*j <= nums[i]; j++)
            {
                if(nums[i] % j == 0)
                {
                    if(j*j == nums[i])
                    {
                        count++;
                        sum +=j;
                    }
                    else
                    {
                        count +=2;
                        sum += j+(nums[i]/j);
                    }
                }
            }
            if(count == 2)
                ans = ans + sum + 1 + nums[i];
        }

        return ans;
    }
}